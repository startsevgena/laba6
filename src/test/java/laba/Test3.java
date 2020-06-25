package laba;

import static org.junit.jupiter.api.Assertions.*;

public class Test3 {

	@org.junit.jupiter.api.Test
	public void test() {
		int a = 200;
		int b = 40;
		int testValue = 5;
		int testingValue = 0;
		testingValue = a / b;
		assertEquals(testValue,  testingValue);
		assertTrue(testValue == testingValue);
	}

}
