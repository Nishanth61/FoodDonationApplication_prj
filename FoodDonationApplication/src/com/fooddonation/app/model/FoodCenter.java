package com.fooddonation.app.model;

import java.util.ArrayList;
import java.util.List;

public class FoodCenter {

	List<FoodPacket> availablefoodPackets;

	List<FoodPacket> vegFoodPackets;

	List<FoodPacket> nonVegFoodPackets;

	public FoodCenter() {
		this.availablefoodPackets = new ArrayList<FoodPacket>();
		this.vegFoodPackets = new ArrayList<FoodPacket>();
		this.nonVegFoodPackets = new ArrayList<FoodPacket>();
	}

	public List<FoodPacket> getAvailablefoodPackets() {
		return availablefoodPackets;
	}

	public void setAvailablefoodPackets(List<FoodPacket> availablefoodPackets) {
		this.availablefoodPackets = availablefoodPackets;
	}

	public List<FoodPacket> getVegFoodPackets() {
		return vegFoodPackets;
	}

	public void setVegFoodPackets(List<FoodPacket> vegFoodPackets) {
		this.vegFoodPackets = vegFoodPackets;
	}

	public List<FoodPacket> getNonVegFoodPackets() {
		return nonVegFoodPackets;
	}

	public void setNonVegFoodPackets(List<FoodPacket> nonVegFoodPackets) {
		this.nonVegFoodPackets = nonVegFoodPackets;
	}

}
