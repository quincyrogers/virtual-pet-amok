package virtualPetShelterAmok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrganicDogTest {

	OrganicDog anyOrganicDog = new OrganicDog("name", 10, 10, 10, 10, 10, 10, "description");

	@Test
	public void shouldReturnAllDogProperties() {
		String name = anyOrganicDog.getName();
		int hunger = anyOrganicDog.getHunger();
		int thirst = anyOrganicDog.getThirst();
		int boredom = anyOrganicDog.getBoredom();
		int waste = anyOrganicDog.getWaste();
		int health = anyOrganicDog.getHealth();
		int happiness = anyOrganicDog.getHappiness();
		String description = anyOrganicDog.getDescription();

		assertEquals("name", name);
		assertEquals(10, hunger);
		assertEquals(10, thirst);
		assertEquals(10, boredom);
		assertEquals(10, waste);
		assertEquals(10, health);
		assertEquals(10, happiness);
		assertEquals("description", description);

	}

	@Test
	public void shouldHaveHungerDecreaseBy5AfterFeed() {
		anyOrganicDog.feed();
		int hunger = anyOrganicDog.getHunger();
		assertEquals(5, hunger);

	}

	@Test
	public void shouldHaveThirstDecreaseBy5AfterWater() {
		anyOrganicDog.water();
		int thirst = anyOrganicDog.getThirst();
		assertEquals(5, thirst);
	}

	@Test
	public void shouldHavePlayIncreaseHungerAndThirstBy5AndDecreaseBoredomBy5() {
		anyOrganicDog.play();
		int hunger = anyOrganicDog.getHunger();
		int thirst = anyOrganicDog.getThirst();
		int boredom = anyOrganicDog.getBoredom();
		assertEquals(15, hunger);
		assertEquals(15, thirst);
		assertEquals(5, boredom);
	}

	@Test
	public void shouldHave0WasteAfterCleaning() {
		anyOrganicDog.clean();
		int waste = anyOrganicDog.getWaste();
		assertEquals(0, waste);

	}

	@Test
	public void shouldHaveWalkDecreaseWasteby5andIncreaseHappinessBy5() {
		anyOrganicDog.walk();
		int waste = anyOrganicDog.getWaste();
		int happiness = anyOrganicDog.getHappiness();
		assertEquals(5, waste);
		assertEquals(15, happiness);
	}

	@Test
	public void shouldHaveHealthDecreaseBy5() {
		anyOrganicDog.reduceHealth();
		int health = anyOrganicDog.getHealth();
		assertEquals(5, health);

	}
}
