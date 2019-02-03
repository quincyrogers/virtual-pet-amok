import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class VirtualPetTest {
	VirtualPet underTest = new VirtualPet("name", "breed", "cage");

	@Test
	public void shouldHaveANameAndBreed() {
		String checkName = underTest.getName();
		String checkBreed = underTest.getBreed();
		String checkCage = underTest.getCage();
		assertThat(checkName, is("name"));
		assert
	}
}