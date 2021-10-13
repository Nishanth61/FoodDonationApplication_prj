package com.fooddonation.app.state;

import com.fooddonation.app.model.FoodPacket;

public class RemoveFoodPacketState implements FoodPacketState {

	FoodPacket foodPacket;

	public RemoveFoodPacketState(FoodPacket foodPacket) {
		this.foodPacket = foodPacket;
	}

	@Override
	public void addFoodPacketToCenter() {
		System.out.println("cannot Add,FoodPacket is ready to remove");
	}

	@Override
	public void pickupFoodPacket() {
		System.out.println("cannot Pickup,FoodPacket is ready to remove");
	}

	@Override
	public void removeFoodPacketToCenter() {
		System.out.println("Remove Food Packet");
		foodPacket.setState(null);
	}

}
