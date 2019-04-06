package virtualPetShelterAmok;

public abstract class VirtualPet {
	
	protected String name;
	protected int boredom;
	protected int health;
	protected String description;
	protected int happiness;

	public VirtualPet() {
		super();
	}
	public String getName() {

		return name;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getHealth() {
		return health;
	}
	public int getHappiness() {
		return happiness;
	}
	public String getDescription() {
		return description;
	}
	
	public abstract void play();

	public void reduceHealth() {
		health -= 5;
	}
	
	public abstract void displayStats();
	
	public abstract void tick();
}
