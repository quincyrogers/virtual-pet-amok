package virtualPetShelterAmok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class BasswoodShelter {
	
	Map<String, VirtualPet> virtualPets = new HashMap<>();
	
	public void admit(VirtualPet anyVirtualPet) {
		virtualPets.put(anyVirtualPet.getName(), anyVirtualPet);
	}
	public VirtualPet findPet(String name) {
		return virtualPets.get(name);
	}

	public Collection<VirtualPet> getAllVirtualPets() {
		return virtualPets.values();
	}

	public void adopt(VirtualPet anyVirtualPet) {
		virtualPets.remove(anyVirtualPet.getName());
	}

	public void feedOrganicPets() {
		for (VirtualPet virtualPet : virtualPets.values()) {
			if (virtualPet instanceof OrganicPet) { 
				((OrganicPet) virtualPet).feed();
			}
		}

	}

	public void waterOrganicPets() {
		for (VirtualPet virtualPet : virtualPets.values()) {
			if (virtualPet instanceof OrganicPet) {
				((OrganicPet) virtualPet).water();
			}
		}

	}

	public void oilRoboticPets() {
		for (VirtualPet virtualPet : virtualPets.values()) {
			if (virtualPet instanceof RoboticPet) {
				((RoboticPet) virtualPet).increaseOilLevel();
			}
		}

	}

	public void tick() {
		for (VirtualPet virtualPet : virtualPets.values()) {
			if (virtualPet instanceof RoboticPet) {
				((OrganicPet) virtualPet).tick();
			} else {
				((RoboticPet) virtualPet).tick();
			}

		}
	}

	public void showAllVirtualPets() {
		for (VirtualPet virtualPets : virtualPets.values()) {
			System.out.println("Name: " + virtualPets.getName() + " description: " + virtualPets.getDescription());

		}
	}

	public void displayPetStats() {
		for (VirtualPet virtualPets : virtualPets.values()) {
			virtualPets.displayStats();
		}
	}

	public void organicPetStats() {
		for (VirtualPet virtualPets : virtualPets.values()) {
			if (virtualPets instanceof OrganicPet) {
				virtualPets.displayStats();
			}

		}
	}

	public void roboticPetStats() {
		for (VirtualPet virtualPets : virtualPets.values()) {
			if (virtualPets instanceof RoboticPet) {
				virtualPets.displayStats();
			}
		}
	}

	public void cleanAllDogCages() {
		for (VirtualPet virtualPets : virtualPets.values()) {
			if (virtualPets instanceof OrganicDog) {
				((OrganicPet) virtualPets).clean();

			}
		}
	}

	public void emptyAllKittyLitterBoxes() {
		for (VirtualPet virtualPets : virtualPets.values()) {
			if (virtualPets instanceof OrganicCat) {
				((OrganicPet) virtualPets).clean();
			}
		}
	}

	public void playWithAllVirtualPets() {
		for (VirtualPet virtualPets : virtualPets.values()) {
			virtualPets.play();
		}
	}

	public void walkDogs() {
		
			for(VirtualPet virtualPets : virtualPets.values())
			{
				if(virtualPets instanceof WalkDogs)
				{
					((WalkDogs) virtualPets).walk();
				}
			}
		}

}
