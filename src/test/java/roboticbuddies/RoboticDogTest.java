package roboticbuddies;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import roboticbuddies.RoboticDog;

public class RoboticDogTest {
	@Test
	public void shouldHaveDefaultPropertyValuesOf10() {
		RoboticDog underTest = new RoboticDog("name", 10, 10, 10);
		String checkName = underTest.getName();
		int checkHealth = underTest.getHealth();
		int checkHappiness = underTest.getHappiness();
		int checkOilLevel = underTest.getOilLevel();
		assertThat(checkName, is("name"));
		assertThat(checkHealth, is(10));
		assertThat(checkHappiness, is(10));
		assertThat(checkOilLevel, is(10));

	}
}
