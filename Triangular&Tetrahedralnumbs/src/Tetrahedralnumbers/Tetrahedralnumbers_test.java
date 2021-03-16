package Tetrahedralnumbers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tetrahedralnumbers_test {

	@Test
	void test() {
		assertEquals(Tetrahedralnumb_Recursion.triangrec(5, 0), 15);
		assertEquals(Tetrahedralnumb_Recursion.triangrec(0, 0), 0);
		assertEquals(Tetrahedralnumb_Recursion.tetrarec(5, 0), 35);
		assertEquals(Tetrahedralnumb_Recursion.tetrarec(0, 0), 0);
		assertEquals(Tetrahedralnumbers_Whileloop.trianwhile(0, 0), 0);
		assertEquals(Tetrahedralnumbers_Whileloop.trianwhile(5, 0), 15);
		assertEquals(Tetrahedralnumbers_Whileloop.tetrawhile(0, 0), 0); 
		assertEquals(Tetrahedralnumbers_Whileloop.tetrawhile(5, 0), 35);
		assertEquals(Tetrahedralnumb_elite.gettetranumb(0, 0, 0, 0), 0);
		assertEquals(Tetrahedralnumb_elite.gettetranumb(5, 0, 0, 0), 35);
		assertEquals(Tetrahedralnumb_elite_Whileloop.gettetranumbwhile(0, 0, 0, 0), 0);
		assertEquals(Tetrahedralnumb_elite_Whileloop.gettetranumbwhile(5, 0, 0, 0), 35);
		
		int[] X = {0,1,2,3,4,5};
		assertEquals(Array.sumIntArray(X,4,3),0);
		assertEquals(Array.sumIntArray(X,0,X.length-1),15);
		assertEquals(Array.sumIntArray(X,2,4),9);
			}
	

}
