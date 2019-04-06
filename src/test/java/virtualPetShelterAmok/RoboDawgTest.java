package virtualPetShelterAmok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoboDawgTest {
	
	RoboDawg anyRoboDawg = new RoboDawg("name", 10, 10, 10, 10, "description");
	
	@Test
	public void shouldReturnAllRoboDawgProperties() {
		String name = anyRoboDawg.getName();
		int boredom = anyRoboDawg.getBoredom();
		int health = anyRoboDawg.getHealth();
		int happiness = anyRoboDawg.getHappiness();
		int oilLevel = anyRoboDawg.getOilLevel();
		String description = anyRoboDawg.getDescription();
		assertEquals("name", name);
		assertEquals(10, boredom);
		assertEquals(10, health);
		assertEquals(10, happiness);
		assertEquals(10, oilLevel);
		assertEquals("description", description);
		
	}
	
	@Test
	public void shouldHavePlayDecreaseBoredomBy5() {
		anyRoboDawg.play();
		int boredom = anyRoboDawg.getBoredom();
		assertEquals(5, boredom);
	}

	@Test
	public void shouldHaveWalkIncreaseHappinessBy5() {
		anyRoboDawg.walk();
		int happiness = anyRoboDawg.getHappiness();
		assertEquals(15, happiness);
	}

	@Test
	public void shouldHaveHealthDecreaseBy5() {
		anyRoboDawg.reduceHealth();
		int health = anyRoboDawg.getHealth();
		assertEquals(5, health);

	}

	@Test
	public void shouldHaveOilLevelDecreaseBy5() {
		anyRoboDawg.reduceOilLevel();
		int oilLevel = anyRoboDawg.getOilLevel();
		assertEquals(5, oilLevel);

	}

	@Test
	public void shouldDecreaseOilLevelBy5AfterPlay() {
		anyRoboDawg.play();
		int oilLevel = anyRoboDawg.getOilLevel();
		assertEquals(5, oilLevel);
	}

	@Test
	public void shouldIncreaseOilLevelAfterOilingBy5() {
		anyRoboDawg.increaseOilLevel();
		int oilLevel = anyRoboDawg.getOilLevel();
		assertEquals(15, oilLevel);
	}

}
