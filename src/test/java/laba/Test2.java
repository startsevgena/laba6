package laba;

import static org.junit.jupiter.api.Assertions.*;

public class Test2 {

	@org.junit.jupiter.api.Test
	public void test() {
		int a = 27;
		int b = a;
		int testValue = 0;
		int testingValue = 0;
		testingValue = a - b;
		assertEquals(testValue,  testingValue);
		assertTrue(testValue == testingValue);
	}

}
