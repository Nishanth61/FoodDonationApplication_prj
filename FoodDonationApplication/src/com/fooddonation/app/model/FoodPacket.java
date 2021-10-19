package com.fooddonation.app.model;

import com.fooddonation.app.builder.FoodPacketBuilder;
import com.fooddonation.app.state.AddFoodPacketState;
import com.fooddonation.app.state.FoodPacketState;
import com.fooddonation.app.state.PickupFoodPacketState;
import com.fooddonation.app.state.RemoveFoodPacketState;

public abstract class FoodPacket {

	String type;
	int size;
	int quantity;
	String foodType;
	boolean nutsIncluded;

	FoodPacketState addFoodPacketState;
	FoodPacketState pickupFoodPacketState;
	FoodPacketState removeFoodPacketState;

	FoodPacketState state;

	public FoodPacket(FoodPacketBuilder builder) {
		this.type = builder.getType();
		this.size = builder.getSize();
		this.quantity = builder.getQuantity();
		this.foodType = builder.getFoodType();
		this.nutsIncluded = builder.isNutsIncluded();
		this.addFoodPacketState = new AddFoodPacketState(this);
		this.pickupFoodPacketState = new PickupFoodPacketState(this);
		this.removeFoodPacketState = new RemoveFoodPacketState(this);
		this.state = addFoodPacketState;
	}

	public FoodPacketState getPickupFoodPacketState() {
		return pickupFoodPacketState;
	}

	public FoodPacketState getRemoveFoodPacketState() {
		return removeFoodPacketState;
	}

	public void setState(FoodPacketState state) {
		this.state = state;
	}

	public void addFoodPacket() {
		state.addFoodPacketToCenter();
	}

	public void removeFoodPacket() {
		state.removeFoodPacketToCenter();
	}

	public void pickUpFoodPacket() {
		state.pickupFoodPacket();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FoodPacket [type=");
		builder.append(type);
		builder.append(", size=");
		builder.append(size);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", foodType=");
		builder.append(foodType);
		builder.append(", nutsIncluded=");
		builder.append(nutsIncluded);
		builder.append("]");
		return builder.toString();
	}

}
