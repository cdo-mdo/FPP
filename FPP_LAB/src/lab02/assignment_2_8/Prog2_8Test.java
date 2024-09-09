package lab02.assignment_2_8;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Prog2_8Test {

	@Test
	public void testMin() {
		int[] dataTest = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		int checkedMin = -22;
		int minNumber = Prog2_8.min(dataTest);
		assertTrue(minNumber == checkedMin);
	}

}
