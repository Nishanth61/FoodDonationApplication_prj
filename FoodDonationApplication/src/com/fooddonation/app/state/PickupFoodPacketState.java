package com.fooddonation.app.state;

import com.fooddonation.app.model.FoodPacket;

public class PickupFoodPacketState implements FoodPacketState {

	FoodPacket foodPacket;

	public PickupFoodPacketState(FoodPacket foodPacket) {
		this.foodPacket = foodPacket;
	}

	@Override
	public void addFoodPacketToCenter() {
		System.out.println("FoodPacket is just picked yet");
	}

	@Override
	public void pickupFoodPacket() {
		System.out.println("Pick up Food Packet");
		foodPacket.setState(foodPacket.getRemoveFoodPacketState());
	}

	@Override
	public void removeFoodPacketToCenter() {
		System.out.println("FoodPacket is just picked yet");

	}

}
