package virtualPetShelterAmok;

public class OrganicDog extends OrganicPet implements WalkDogs{

	public OrganicDog(String name, int hunger, int thirst, int boredom, int waste, int health, int happiness, String description) {
		
	}

	@Override
	public void walk() {
		waste -= 5;
		happiness += 5;
		
	}
	
	

}
