package com.fooddonation.app.factory;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.fooddonation.app.builder.FoodPacketBuilder;
import com.fooddonation.app.model.FoodPacket;
import com.fooddonation.app.model.NonVegeterianFoodPacket;
import com.fooddonation.app.model.VegeterianFoodPacket;

class FoodPacketFactoryTest {

	@Test
	void testGetFoodPacket_Veg() {

		FoodPacketBuilder builder = new FoodPacketBuilder().addType("VEG").addSize(1).addQuantity(1)
				.addFoodType("BreakFast").addNuts(true);
		VegeterianFoodPacket expectedFoodPacket = new VegeterianFoodPacket(builder);
		FoodPacket actualFoodPacket = FoodPacketFactory.getFoodPacket(builder);
		Assert.assertEquals(expectedFoodPacket.toString(), actualFoodPacket.toString());

	}

	@Test
	void testGetFoodPacket_NonVeg() {

		FoodPacketBuilder builder = new FoodPacketBuilder().addType("NON-VEG").addSize(1).addQuantity(1)
				.addFoodType("Lunch").addNuts(true);
		NonVegeterianFoodPacket expectedFoodPacket = new NonVegeterianFoodPacket(builder);
		FoodPacket actualFoodPacket = FoodPacketFactory.getFoodPacket(builder);
		Assert.assertEquals(expectedFoodPacket.toString(), actualFoodPacket.toString());

	}

}
