package virtualPetShelterAmok;

public class RoboDawg extends RoboticPet implements WalkDogs{

	public RoboDawg(String name, int boredom , int health, int happiness, int oilLevel, String description) {
		this.name = name;
		this.boredom = boredom;
		this.health = health;
		this.happiness = happiness;
		this.oilLevel = oilLevel;
		this.description = description;

	}

	@Override
	public void walk() {
		happiness += 5;
		
	}

}
