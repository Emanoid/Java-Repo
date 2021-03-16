package Primelessthan_n;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeLessThan_n_Test {

	@Test
	void test() {
		assertEquals(PrimeLessThan_n.primes(2), 1);
		assertEquals(PrimeLessThan_n.primes(9), 4);
		assertEquals(PrimeLessThan_n.primes(25), 9);
		
		boolean[] A = {true, true, true, true, true, true, true, true, true, true, true};
		boolean[] B = {true, true, true, true, false, true, false, true, false, false, false};
		PrimeLessThan_n.markNonPrimes(A, 2, 10);
		assertArrayEquals(A, B);
		
		boolean[] C = {true, true, true, true, true, true, true, true, true, true, true};
		boolean[] D = {true, true, true, true, false, true, false, true, false, true, false};
		PrimeLessThan_n.markMultiples(C, 2, 10);
		assertArrayEquals(C, D);
		
		boolean[] E = new boolean[11];
		boolean[] F = {false, false, true, true, true, true, true, true, true, true, true};
		PrimeLessThan_n.initArray(E, 2, 10);
		assertArrayEquals(E, F);
		
		boolean[] G = {false, false, true, true, false, true, false, true, false, true, true};
		assertEquals(PrimeLessThan_n.countTrue(G, 2, 10), 6);
		
		
		
	}

}