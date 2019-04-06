package virtualPetShelterAmok;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BasswoodShelterTest {

	private BasswoodShelter bwShelter;
	private OrganicDog cuddy;
	private OrganicCat smokie;
	private RoboDawg maeve;
	private RoboCat misterb;

	@Before
	public void setUp() {
		bwShelter = new BasswoodShelter();
		cuddy = new OrganicDog("Cuddy", 10, 10, 10, 10, 10, 10,
				"Young and wild mixed breed with a loose bladder. His former owner loves Persian Rugs and so did Cuddy.");
		smokie = new OrganicCat("Smokie", 10, 10, 10, 10, 10, 10,
				"An American Bobtail but he quite possibly could be a bobcat so be careful.. either way Smokie would do well on a farm or as possibly an agent in the war on sewer rats in NYC.");
		maeve = new RoboDawg("Maeve", 10, 10, 10, 10,
				"Maeve is a robotic dog programmed to be a guard dog in a gated community in Boca Raton. She came to us a glitch in her code caused her to fetch sweets for diabetics in an assisted living facility. The bug or flea was found and fixed.");
		misterb = new RoboCat("Mister B", 10, 10, 10, 10,
				"Mr.B was a companion to a evil crime lord and was originally programmed to trip while the walked near spinal staircases, but we have reprogrammed him to play Jenga.");
	}
	
	@Test
	public void shouldBeAbleToAdmitMultiplePetsIntoShelter() {
		bwShelter.admit(cuddy);
		bwShelter.admit(smokie);
		bwShelter.admit(maeve);
		bwShelter.admit(misterb);
	}
	
	@Test
	public void shouldBeAbleToFeedAllOrganicPets() {
		bwShelter.admit(cuddy);
		bwShelter.admit(smokie);
		bwShelter.feedOrganicPets();
		int check = cuddy.getHunger();
		assertEquals(5, check);
		check = smokie.getHunger();
		assertEquals(5, check);
	}

	@Test
	public void shouldBeAbleToWaterAllOrganicPets() {
		bwShelter.admit(cuddy);
		bwShelter.admit(smokie);
		bwShelter.waterOrganicPets();
		int check = cuddy.getThirst();
		assertEquals(5, check);
		check = smokie.getThirst();
		assertEquals(5, check);
	}

	@Test
	public void shouldBeAbleToOilAllRoboticPets() {
		bwShelter.admit(maeve);
		bwShelter.admit(misterb);
		bwShelter.oilRoboticPets();
		int check = maeve.getOilLevel();
		assertEquals(15, check);
		check = misterb.getOilLevel();
		assertEquals(15, check);
	}

	@Test
	public void shouldBeAbleToIncreaseHungerThirstBoredomWasteWithTickForOrganicPets() {
		bwShelter.admit(cuddy);
		bwShelter.admit(smokie);
		bwShelter.tick();
		int check = cuddy.getHunger();
		assertEquals(15, check);
		check = smokie.getThirst();
		assertEquals(15, check);
		check = smokie.getBoredom();
		assertEquals(15, check);
		check = cuddy.getWaste();
		assertEquals(15, check);

	}
	@Test
	public void shouldBeAbleToDecreaseOilLevelWithTickInRoboPets() {
		bwShelter.admit(maeve);
		bwShelter.admit(misterb);
		bwShelter.tick(); 
		int check = maeve.getOilLevel(); 
		assertEquals(5, check); 
		check = misterb.getOilLevel(); 
		assertEquals(5, check); 
	}

}
