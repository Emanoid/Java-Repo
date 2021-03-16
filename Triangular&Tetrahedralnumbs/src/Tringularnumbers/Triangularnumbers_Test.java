package Tringularnumbers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Triangularnumbers_Test {

	@Test
	void test() {
		assertEquals(Triangularnumb_Whileloop.Compute(5), 15);
		assertEquals(Triangularnumb_Whileloop.Compute(0), 0);
		assertEquals(Triangularnumb_Recursion.triangrec(5, 0), 15);
		assertEquals(Triangularnumb_Recursion.triangrec(0, 0), 0);
	}

}
