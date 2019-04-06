package virtualPetShelterAmok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrganicCatTest {
	
	OrganicCat anyOrganicCat = new OrganicCat("name", 10, 10, 10, 10, 10, 10, "description");
	
	@Test
	public void shouldReturnAllProperties() {
		String name = anyOrganicCat.getName();
		int hunger = anyOrganicCat.getHunger();
		int thirst = anyOrganicCat.getThirst();
		int boredom = anyOrganicCat.getBoredom();
		int waste = anyOrganicCat.getWaste();
		int health = anyOrganicCat.getHealth();
		int happiness = anyOrganicCat.getHappiness();
		String description = anyOrganicCat.getDescription();
		
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
	public void shouldHaveThirstDecreaseBy5AfterWater() {
		anyOrganicCat.water();
		int thirst = anyOrganicCat.getThirst();
		assertEquals(5, thirst);
	}
	
	@Test
	public void shouldHavePlayIncreaseHungerAndThirstBy5AndDecreaseBoredomBy5() {
		anyOrganicCat.play();
		int hunger = anyOrganicCat.getHunger();
		int thirst = anyOrganicCat.getThirst();
		int boredom = anyOrganicCat.getBoredom();
		assertEquals(15, hunger);
		assertEquals(15, thirst);
		assertEquals(5, boredom);
	}
	
	@Test
	public void shouldHave0WasteAfterCleaning() {
		anyOrganicCat.clean();
		int waste = anyOrganicCat.getWaste();
		assertEquals(0, waste);

	}
	
	@Test
	public void shouldHaveHealthDecreaseBy5() {
		anyOrganicCat.reduceHealth();
		int health = anyOrganicCat.getHealth();
		assertEquals(5, health);

	}

}
