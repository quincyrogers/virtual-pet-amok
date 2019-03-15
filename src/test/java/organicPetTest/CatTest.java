package organicPetTest;
	

	import static org.junit.Assert.assertEquals;

	import org.junit.Test;

import organicPet.Cat;
import virtualPet.VirtualPet;

public class CatTest {

	VirtualPet underTest = new Cat("Bootsy", "Is a cat", 20, 30, 40, 50, 35);

	@Test
	public void shouldReturnCatName() {
		String check = underTest.getName();
		assertEquals(check, "Bootsy");
	}

	@Test
	public void shouldReturnCatDescription() {
		String check = underTest.getType();
		assertEquals(check, "Is a cat");
	}

	@Test
	public void shouldReturnCatHunger() {
		int check = underTest.getHunger();
		assertEquals(check, 20);
	}

	@Test
	public void shouldReturnCatWater() {
		int check = underTest.getWater();
		assertEquals(check, 30);
	}

	@Test
	public void shouldReturnCatBoredom() {
		int check = underTest.getBoredom();
		assertEquals(check, 40);
	}

	@Test
	public void shouldReturnCatWaste() {
		int check = underTest.getWaste();
		assertEquals(check, 50);
	}

	@Test
	public void shouldReturnCatHappiness() {
		int check = underTest.getHappiness();
		assertEquals(check, 35);
	}

}
