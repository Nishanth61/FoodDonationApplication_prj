package com.fooddonation.app.state;

import com.fooddonation.app.model.FoodPacket;

public class AddFoodPacketState implements FoodPacketState {

	FoodPacket foodPacket;

	public AddFoodPacketState(FoodPacket foodPacket) {
		this.foodPacket = foodPacket;
	}

	@Override
	public void addFoodPacketToCenter() {
		System.out.println("Add Food Packet State");
		foodPacket.setState(foodPacket.getPickupFoodPacketState());
	}

	@Override
	public void pickupFoodPacket() {
		System.out.println("FoodPacket is not added yet");
	}

	@Override
	public void removeFoodPacketToCenter() {
		System.out.println("FoodPacket is not added yet");
	}

}
