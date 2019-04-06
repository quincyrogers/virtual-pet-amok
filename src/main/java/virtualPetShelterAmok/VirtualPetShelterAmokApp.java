package virtualPetShelterAmok;

import java.util.Scanner;


public class VirtualPetShelterAmokApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		BasswoodShelter bwShelter = new BasswoodShelter();

		OrganicDog cuddy = new OrganicDog("Cuddy", 10, 10, 10, 10, 10, 10,
				"Young and wild mixed breed with a loose bladder. His former owner loves Persian Rugs and so did Cuddy.");
		OrganicCat smokie = new OrganicCat("Smokie", 10, 10, 10, 10, 10, 10,
				"An American Bobtail but he quite possibly could be a bobcat so be careful.. either way Smokie would do well on a farm or as possibly an agent in the war on sewer rats in NYC.");
		RoboDawg maeve = new RoboDawg("Maeve", 10, 10, 10, 10,
				"Maeve is a robotic dog programmed to be a guard dog in a gated community in Boca Raton. She came to us a glitch in her code caused her to fetch sweets for diabetics in an assisted living facility. The bug or flea was found and fixed.");
		RoboCat misterb = new RoboCat("Mister B", 10, 10, 10, 10,
				"Mr.B was a companion to a evil crime lord and was originally programmed to trip while the walked near spinal staircases, but we have reprogrammed him to play Jenga.");

		bwShelter.admit(cuddy);
		bwShelter.admit(smokie);
		bwShelter.admit(maeve);
		bwShelter.admit(misterb);
		
		System.out.println("Welcome to Basswood Virtual Pet Shelter Linden's finest gathering place for pets and people looking to for family. It's more than a shelter people!");
		System.out.println("");
		System.out.println("Here is a list of our furry organic and shiny robotic pets: ");
		System.out.println("");
		bwShelter.showAllVirtualPets();
		
		String choice = "";
		do {
			System.out.println("How would you like to help our buddies today?");
			System.out.println("");
			System.out.println("Type 1 - to admit a pet to the shelter");
			System.out.println("Type 2 - to adopt a pet from the shelter");
			System.out.println("Type 3 - to show stats of all pets");
			System.out.println("Type 4 - choose a pet to play with");
			System.out.println("Type 5 - to take all the dogs for a walk (good luck!)");
			System.out.println("Type 6 - to see your options for the organic pets");
			System.out.println("Type 7 - to oil the robotic pets");
			System.out.println("Type 8 - to exit (hopefully it's with a new pet!");
			choice = input.nextLine();
			
			if (choice.equals("1")) {
				System.out.println("Which type of pet will you be admitting to the Basswood Shelter?");
				System.out.println("Organic Dog, Organic Cat, RoboDawg or RoboCat?");
				String virtualPet = input.nextLine();

				if (virtualPet.equalsIgnoreCase("Dog, Organic Dog")) {
					System.out.println("Please enter the name of the organic dog");
					String name = input.nextLine();
					System.out.println("Tell us a little about your pet");
					String description = input.nextLine();
					System.out.println();
					bwShelter.admit(new OrganicDog(name, 10, 10, 10, 10, 10, 10, description));

				} else if (virtualPet.equalsIgnoreCase("Cat, Organic Cat")) {
					System.out.println("Please enter the name of the organic cat");
					String petName = input.nextLine();
					System.out.println("Tell us a little about your pet");
					String description = input.nextLine();
					System.out.println();
					bwShelter.admit(new OrganicCat(petName, 10, 10, 10, 10, 10, 10, description));

				} else if (virtualPet.equalsIgnoreCase("RoboDog")) {
					System.out.println("Please enter the name of the RoboDog");
					String petName = input.nextLine();
					System.out.println("Tell us a little about your pet");
					String description = input.nextLine();
					bwShelter.admit(new RoboDawg(petName, 10, 10, 10, 10, description));

				} else if (virtualPet.equalsIgnoreCase("RoboCat")) {
					System.out.println("Please enter the name of the RoboCat");
					String petName = input.nextLine();
					System.out.println("Tell us a little about your pet");
					String description = input.nextLine();
					bwShelter.admit(new RoboCat(petName, 10, 10, 10, 10, description));
				} else {
					System.out.println("Thank you!!");
				}
			}

			if (choice.equalsIgnoreCase("2")) {
				System.out.println("Type the name of the pet you would like to adopt");
				bwShelter.showAllVirtualPets();
				String name = input.nextLine();
				System.out.println("");
				System.out.println("Thank you for choosing" + name + " !");
			bwShelter.adopt(bwShelter.findPet(name));
			}
			if (choice.equalsIgnoreCase("3")) {
				System.out.println("Here's an update on our pets");
				bwShelter.displayPetStats();
			}
			if (choice.equalsIgnoreCase("4")) {
				bwShelter.showAllVirtualPets();
				System.out.println("Choose a pet to play with");
				String name = input.nextLine();
				System.out.println("");
			}
			if (choice.equalsIgnoreCase("5")) {
				bwShelter.walkDogs();
				System.out.println("You looks like you both had a nice workout! Thank you!");
			}
			if (choice.equalsIgnoreCase("6")) {

				do {
					bwShelter.organicPetStats();
					System.out.println("");
					System.out.println("Type A - to feed");
					System.out.println("Type B - to water");
					System.out.println("Type C - to clean dog cages");
					System.out.println("Type D - to empty the kitty liter boxes ");
					System.out.println("Type E - to go back to the main page ");
					System.out.println("");
					choice = input.nextLine();

					if (choice.equalsIgnoreCase("A")) {
						bwShelter.feedOrganicPets();
						System.out.println("Thank you! Everyone with four is fed, full and happy!");

					} else if (choice.equalsIgnoreCase("B")) {
						bwShelter.waterOrganicPets();
						System.out.println("Thank you for watering the pets!");
					} else if (choice.equalsIgnoreCase("C")) {
						bwShelter.cleanAllDogCages();
						System.out.println("Thanks for helping with my least favorite job!");

					} else if (choice.equalsIgnoreCase("D")) {
						bwShelter.emptyAllKittyLitterBoxes();
						System.out.println("Ahh! We all are breathing better with that smell gone! ");
					} else {
						System.out.println("Thanks for helping out with the organic and robotic animals today!");
					}
				} while (!choice.equals("E"));

			}
			if (choice.equalsIgnoreCase("7")) {
				bwShelter.oilRoboticPets();
				System.out.println("No more squeaky pets!");
			}

			if (choice.equalsIgnoreCase("8")) {
				System.out.println("Thank you for all of your help today! Please come back anytime!!! ");
			}
			System.out.println("");
			System.out.println("Our pets stats are currently at : ");
			bwShelter.showAllVirtualPets();

		} while (!choice.equals("exit"));

		input.close();
	}
	
}
