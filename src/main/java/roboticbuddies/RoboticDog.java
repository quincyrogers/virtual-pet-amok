package roboticbuddies;

public class RoboticDog {

	private String name;
	private int health;
	private int happiness;
	private int oillevel;

	public RoboticDog(String name, int health, int happiness, int oillevel) {
		this.name = name;
		this.health = health;
		this.happiness = happiness;
		this.oillevel = oillevel;
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

	public int getOilLevel() {

		return oillevel;
	}

}
