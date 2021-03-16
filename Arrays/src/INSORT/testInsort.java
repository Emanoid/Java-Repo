package INSORT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testInsort {

	@Test
	void test() {
		int[] Y = {50,30,4,1,2,0};
		int[] Z = {32,8,90,87,4,8,2,17};
		Insort.insort(Z,3,6);
		Insort.insort(Y,0,5);
		assertArrayEquals(Y, new int[] {0,1,2,4,30,50});
		assertArrayEquals(Z, new int[] {32,8,90,2,4,8,87,17});
			}
	
	public void testInsert() {
		int[] Y = {34,0,1,3,4,2,21};
		Insort.insert(Y, 1, 5);
		assertArrayEquals(Y,new int[] {34,0,1,2,3,4,21});
		
	}
	
	public void testSwap() {
		int[] Y  = {34,0,1,3,4,2,21};
		Insort.swap(Y,0,5);
		assertArrayEquals(Y,new int[]{2,0,1,33,4,34,21});
		Insort.swap(Y,3,5);
		assertArrayEquals(Y, new int[] {21,0,1,34,4,3,21});
	}

}
