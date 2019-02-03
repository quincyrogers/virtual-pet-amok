

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class OrganicDogTest {
	
	@Test
	public void shouldHaveDefaultPropertyValuesOf10() {
		OrganicDog underTest = new OrganicDog("name", 10, 10, 10, 10);
		String checkName = underTest.getName();
		int checkHealth = underTest.getHealth();
		int checkHappiness = underTest.getHappiness();
		int checkHunger = underTest.getHunger();
		int checkThirst = underTest.getThirst();
		assertThat(checkName, is("name"));
		assertThat(checkHealth, is(10));
		assertThat(checkHappiness, is(10));
		assertThat(checkHunger, is (10));
		assertThat(checkThirst, is (10));
		
	}
	
	

}
