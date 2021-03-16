package Tri_Tetra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tester {

	@Test
	void test() {
		assertEquals(Triangular_numbers_Whileloop.Compute(5), 15);
		assertEquals(Triangular_numbers_Whileloop.Compute(0), 0);
	}

}
