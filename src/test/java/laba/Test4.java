package laba;

import static org.junit.jupiter.api.Assertions.*;

public class Test4 {

	@org.junit.jupiter.api.Test
	public void test() {
		int a = 4;
		int b = 5;
		int testValue = 20;
		int testingValue = 0;
		testingValue = a * b;
		assertEquals(testValue,  testingValue);
		assertTrue(testValue == testingValue);
	}

}