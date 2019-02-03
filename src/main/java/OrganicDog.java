
public class OrganicDog {

	private String name;
	private int health;
	private int happiness;
	private int hunger;
	private int thirst;

	public OrganicDog(String name, int health, int happiness, int hunger, int thirst) {
		this.name = name;
		this.health = health;
		this.happiness = happiness;
		this.hunger = hunger;
		this.thirst = thirst;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getHappiness() {
		return happiness;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

}
