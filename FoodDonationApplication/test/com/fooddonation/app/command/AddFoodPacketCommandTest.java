package com.fooddonation.app.command;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.fooddonation.app.builder.FoodPacketBuilder;
import com.fooddonation.app.model.VegeterianFoodPacket;


class AddFoodPacketCommandTest {

	@Test
	void testExecute() {
		FoodPacketBuilder builder = new FoodPacketBuilder().addType("VEG").addSize(1).addQuantity(1)
				.addFoodType("BreakFast").addNuts(true);
		VegeterianFoodPacket expectedFoodPacket = new VegeterianFoodPacket(builder);
		
		AddFoodPacketCommand addFoodPacketCommand = new AddFoodPacketCommand(expectedFoodPacket);
		String actualState = addFoodPacketCommand.execute();
		Assert.assertEquals("Add Food Packet Command", actualState);
	
	}

}
