package virtualPetShelterAmok;

public abstract class OrganicPet extends VirtualPet {
	protected int hunger;
	protected int thirst;
	protected int waste;

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getWaste() {
		return waste;
	}

	public void feed() {
		hunger -= 5;
	}

	public void water() {
		thirst -= 5;
	}

	public void clean() {
		waste = 0;
	}

	@Override
	public void play() {
		hunger += 5;
		thirst += 5;
		boredom -= 5;
	}

	public void tick() {
		hunger += 5;
		thirst += 5;
		boredom += 5;
		waste += 5;
	}

	public void displayStats() {
		System.out.println("Name: " + name + " Hunger: " + hunger + " " + " Thirst: " + thirst + " " + " Boredom: "
				+ boredom + " " + " Waste: " + waste + " " + " Health: " + health + " " + " Happiness: " + happiness);
	}
}
