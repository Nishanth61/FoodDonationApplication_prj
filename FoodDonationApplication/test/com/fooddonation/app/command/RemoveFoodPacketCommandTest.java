package com.fooddonation.app.command;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.fooddonation.app.builder.FoodPacketBuilder;
import com.fooddonation.app.model.VegeterianFoodPacket;

class RemoveFoodPacketCommandTest {

	@Test
	void testExecute() {
		FoodPacketBuilder builder = new FoodPacketBuilder().addType("VEG").addSize(1).addQuantity(1)
				.addFoodType("BreakFast").addNuts(true);
		VegeterianFoodPacket expectedFoodPacket = new VegeterianFoodPacket(builder);
		expectedFoodPacket.addFoodPacket();
		expectedFoodPacket.pickUpFoodPacket();
		RemoveFoodPacketCommand removeFoodPacketCommand = new RemoveFoodPacketCommand(expectedFoodPacket);
		String actualState = removeFoodPacketCommand.execute();
		Assert.assertEquals("Remove Food Packet Command", actualState);
	}

}
