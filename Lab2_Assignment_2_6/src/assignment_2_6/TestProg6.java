package assignment_2_6;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestProg6 {
	@Test
	public void testRemoveDups() {
		String[] testData = {"horse", "dog", "cat", "horse", "dog"};
		String[] checks = {"horse", "dog", "cat"};
		
		String[] result = Prog6.removeDups(testData);
		assertTrue(result.length == checks.length);
		for (int i = 0; i < result.length; i++) {
			assertTrue(result[i].equals(checks[i]));
		}
		
	}
}
