package com.fooddonation.app.command;

import com.fooddonation.app.model.FoodPacket;

public class RemoveFoodPacketCommand implements Command {

	FoodPacket packet;

	public RemoveFoodPacketCommand(FoodPacket packet) {
		this.packet = packet;
	}

	@Override
	public String execute() {
		packet.removeFoodPacket();
		return "Remove Food Packet Command";
	}

}
