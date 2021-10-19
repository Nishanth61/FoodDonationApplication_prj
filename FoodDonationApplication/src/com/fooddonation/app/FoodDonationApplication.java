package com.fooddonation.app;

import java.util.Scanner;

import com.fooddonation.app.builder.FoodPacketBuilder;
import com.fooddonation.app.command.AddFoodPacketCommand;
import com.fooddonation.app.command.PickupFoodPacketCommand;
import com.fooddonation.app.command.RemoveFoodPacketCommand;
import com.fooddonation.app.factory.FoodPacketFactory;
import com.fooddonation.app.model.FoodCenter;
import com.fooddonation.app.model.FoodPacket;

public class FoodDonationApplication {

	public static void main(String[] args) {

		System.out.printf("**************************************************************\n");
		System.out.printf("WELCOME TO FOOD DONATION APPLICATION");
		System.out.printf("**************************************************************\n");

		Scanner scanner = new Scanner(System.in);
		FoodCenter foodCenter = new FoodCenter();
		AddFoodPacketCommand addFoodPacketCommand = null;
		PickupFoodPacketCommand pickupFoodPacketCommand = null;
		RemoveFoodPacketCommand removeFoodPacketCommand = null;

		do {

			System.out.println("Main Menu: ");
			System.out.println("1.Food Donor");
			System.out.println("2.Food Reciever");
			System.out.println("3.Exit");

			System.out.println("Choose one to proceed");

			int mainMenuOption = scanner.nextInt();

			switch (mainMenuOption) {

			case 1:
				System.out.println("Food Donor Menu: ");
				System.out.println("1.Add Veg Breakfast");
				System.out.println("2.Add Veg Lunch");
				System.out.println("3.Add Veg Dinner");
				System.out.println("4.Add Non-Veg Breakfast");
				System.out.println("5.Add Non-Veg Lunch");
				System.out.println("6.Add Non-Veg Dinner");
				System.out.println("Choose one to proceed");
				int foodDonorOption = scanner.nextInt();

				switch (foodDonorOption) {
				case 1:
					FoodPacketBuilder builder = new FoodPacketBuilder().addType("VEG").addSize(1).addQuantity(1)
							.addFoodType("BreakFast").addNuts(true);
					FoodPacket vegBreakFastPacket = FoodPacketFactory.getFoodPacket(builder);
					addFoodPacketCommand = new AddFoodPacketCommand(vegBreakFastPacket);
					addFoodPacketCommand.execute();
					foodCenter.getAvailablefoodPackets().add(vegBreakFastPacket);
					foodCenter.getVegFoodPackets().add(vegBreakFastPacket);

					break;
				case 2:
					builder = new FoodPacketBuilder().addType("VEG").addSize(1).addQuantity(1).addFoodType("Lunch")
							.addNuts(false);
					FoodPacket vegLunch = FoodPacketFactory.getFoodPacket(builder);
					addFoodPacketCommand = new AddFoodPacketCommand(vegLunch);
					addFoodPacketCommand.execute();
					foodCenter.getAvailablefoodPackets().add(vegLunch);
					foodCenter.getVegFoodPackets().add(vegLunch);

					break;
				case 3:
					builder = new FoodPacketBuilder().addType("VEG").addSize(1).addQuantity(1).addFoodType("Dinner")
							.addNuts(false);
					FoodPacket vegDinner = FoodPacketFactory.getFoodPacket(builder);
					addFoodPacketCommand = new AddFoodPacketCommand(vegDinner);
					addFoodPacketCommand.execute();
					foodCenter.getAvailablefoodPackets().add(vegDinner);
					foodCenter.getVegFoodPackets().add(vegDinner);

					break;
				case 4:
					builder = new FoodPacketBuilder().addType("NON-VEG").addSize(1).addQuantity(1)
							.addFoodType("Breakfast").addNuts(false);
					FoodPacket nonvegBreakFastPacket = FoodPacketFactory.getFoodPacket(builder);
					addFoodPacketCommand = new AddFoodPacketCommand(nonvegBreakFastPacket);
					addFoodPacketCommand.execute();
					foodCenter.getAvailablefoodPackets().add(nonvegBreakFastPacket);
					foodCenter.getNonVegFoodPackets().add(nonvegBreakFastPacket);

					break;
				case 5:
					builder = new FoodPacketBuilder().addType("NON-VEG").addSize(1).addQuantity(1).addFoodType("Lunch")
							.addNuts(true);
					FoodPacket nonvegLunch = FoodPacketFactory.getFoodPacket(builder);
					addFoodPacketCommand = new AddFoodPacketCommand(nonvegLunch);
					addFoodPacketCommand.execute();
					foodCenter.getAvailablefoodPackets().add(nonvegLunch);
					foodCenter.getNonVegFoodPackets().add(nonvegLunch);

					break;
				case 6:
					builder = new FoodPacketBuilder().addType("NON-VEG").addSize(1).addQuantity(1).addFoodType("Dinner")
							.addNuts(true);
					FoodPacket nonvegDinner = FoodPacketFactory.getFoodPacket(builder);
					addFoodPacketCommand = new AddFoodPacketCommand(nonvegDinner);
					addFoodPacketCommand.execute();
					foodCenter.getAvailablefoodPackets().add(nonvegDinner);
					foodCenter.getNonVegFoodPackets().add(nonvegDinner);

					break;

				}

				break;
			case 2:
				System.out.println("Food Reciever Menu: ");
				System.out.println("1.Get All from Food Center");
				System.out.println("2.Get All Veg from Food Center");
				System.out.println("3.Get All Non-Veg from Food Center");
				System.out.println("4.Select Veg Food");
				System.out.println("5.Select Non Veg Food");

				System.out.println("Choose one to proceed");
				int foodRecieverOption = scanner.nextInt();

				switch (foodRecieverOption) {
				case 1:
					System.out.println(
							"Total Number of Food Packets Available " + foodCenter.getAvailablefoodPackets().size());
					break;
				case 2:
					System.out.println(
							"Total Number of Veg Food Packets Available " + foodCenter.getVegFoodPackets().size());
					break;
				case 3:
					System.out.println("Total Number of Non-Veg Food Packets Available "
							+ foodCenter.getNonVegFoodPackets().size());
					break;
				case 4:
					if (foodCenter.getVegFoodPackets().isEmpty()) {
						System.out.println("No Veg Packets available");
					} else {
						System.out.println("Selected Vegetarian Food ");
						FoodPacket vegfp = foodCenter.getVegFoodPackets().remove(0);

						if (vegfp != null) {
							foodCenter.getAvailablefoodPackets().remove(vegfp);
							pickupFoodPacketCommand = new PickupFoodPacketCommand(vegfp);
							pickupFoodPacketCommand.execute();
							removeFoodPacketCommand = new RemoveFoodPacketCommand(vegfp);
							removeFoodPacketCommand.execute();
						}

					}
					break;
				case 5:
					if (foodCenter.getNonVegFoodPackets().isEmpty()) {
						System.out.println("No Non Veg Packets available");
					} else {
						System.out.println("Selected Non-Vegetarian Food ");
						FoodPacket nonvegfp = foodCenter.getNonVegFoodPackets().remove(0);

						if (nonvegfp != null) {
							foodCenter.getAvailablefoodPackets().remove(nonvegfp);
							pickupFoodPacketCommand = new PickupFoodPacketCommand(nonvegfp);
							pickupFoodPacketCommand.execute();
							removeFoodPacketCommand = new RemoveFoodPacketCommand(nonvegfp);
							removeFoodPacketCommand.execute();
						}
					}
					break;
				}
				break;
			case 3:
				break;
			default:
				System.out.println("Invalid Option");
				break;

			}

			if (mainMenuOption == 3) {
				break;
			}

		} while (true);

		System.out.println("THANK YOU FOR USING THE FOOD DONATION APP");

	}

}
