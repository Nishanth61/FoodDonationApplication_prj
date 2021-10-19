package com.fooddonation.app.command;

import com.fooddonation.app.model.FoodPacket;

public class AddFoodPacketCommand implements Command {
	
	FoodPacket packet;

	public AddFoodPacketCommand(FoodPacket packet) {
		this.packet = packet;
	}
	
	@Override
	public String execute() {
		packet.addFoodPacket();
		return "Add Food Packet Command";
	}

}
