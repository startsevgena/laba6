package laba;

import static org.junit.jupiter.api.Assertions.*;

public class Test7 {

	@org.junit.jupiter.api.Test
	public void test() {
		int a = 7;
		int b = 7;
		int testValue = 7;
		int testingValue = 0;
		testingValue = a * b;
		assertEquals(testValue,  testingValue);
		assertTrue(testValue == testingValue);
	}

}