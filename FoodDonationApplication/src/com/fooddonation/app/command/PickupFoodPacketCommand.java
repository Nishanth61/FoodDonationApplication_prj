package com.fooddonation.app.command;

import com.fooddonation.app.model.FoodPacket;

public class PickupFoodPacketCommand implements Command {

	FoodPacket packet;

	public PickupFoodPacketCommand(FoodPacket packet) {
		this.packet = packet;
	}

	@Override
	public String execute() {
		packet.pickUpFoodPacket();
		return "PickUp Food Packet Command";
	}

}
