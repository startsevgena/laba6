package laba;

import static org.junit.jupiter.api.Assertions.*;

public class Test5 {

	@org.junit.jupiter.api.Test
	public void test() {
		int a = 5;
		int b = 6;
		int testValue = 30;
		int testingValue = 0;
		testingValue = a * b;
		assertEquals(testValue,  testingValue);
		assertTrue(testValue == testingValue);
	}

}