package com.fooddonation.app.builder;

public class FoodPacketBuilder {

	String type;
	int size;
	int quantity;
	String foodType;
	// Iam Adding this point because some people has food allergy 
	boolean nutsIncluded;

	public FoodPacketBuilder addType(String type) {
		this.type = type;
		return this;
	}

	public FoodPacketBuilder addSize(int size) {
		this.size = size;
		return this;
	}

	public FoodPacketBuilder addQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}

	public FoodPacketBuilder addFoodType(String foodType) {
		this.foodType = foodType;
		return this;
	}

	public FoodPacketBuilder addNuts(boolean nutsIncluded) {
		this.nutsIncluded = nutsIncluded;
		return this;
	}

	public String getType() {
		return type;
	}

	public int getSize() {
		return size;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getFoodType() {
		return foodType;
	}

	public boolean isNutsIncluded() {
		return nutsIncluded;
	}

}
