package roboticPetTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import roboticPets.RoboticPet;


roboticPets extends VirtualPet {
}

public class RoboDogTest {
	RoboticPet underTest = new RoboticPet("Jax", "Is a Robot Dog", 40, 50, 30);

	

	@Test
	public void shouldReturnRobotDogOil() {
		int check = underTest.getOilLevel();
		assertEquals(check, 40);
	}

	@Test
	public void shouldReturnRobotDogBatteryLevel() {
		int check = underTest.getBatteryLevel();
		assertEquals(check, 50);
	}

}