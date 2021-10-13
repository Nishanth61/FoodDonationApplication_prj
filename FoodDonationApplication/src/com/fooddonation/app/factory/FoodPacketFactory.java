package com.fooddonation.app.factory;

import com.fooddonation.app.builder.FoodPacketBuilder;
import com.fooddonation.app.model.FoodPacket;
import com.fooddonation.app.model.NonVegeterianFoodPacket;
import com.fooddonation.app.model.VegeterianFoodPacket;

public class FoodPacketFactory {

	public static FoodPacket getFoodPacket(FoodPacketBuilder builder) {
		FoodPacket foodPacket = null;

		if (builder.getType().equalsIgnoreCase("VEG")) {
			foodPacket = new VegeterianFoodPacket(builder);
		} else if (builder.getType().equalsIgnoreCase("NON-VEG")) {
			foodPacket = new NonVegeterianFoodPacket(builder);
		}

		return foodPacket;
	}
}
