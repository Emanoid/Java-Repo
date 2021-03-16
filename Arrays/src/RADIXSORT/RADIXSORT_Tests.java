package RADIXSORT;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class RADIXSORT_Tests {
	@Test
	void Bucket() {
		IBucket<Integer> B= new Bucket<Integer>();
		B.add(0);
		B.add(1);
		B.add(2);
		B.add(3);
		Integer X[] = {0,0,0,0};
		Integer Y[] = {0,1,2,3};
		assertEquals(B.toArray(X, 0) , 4);
		assertEquals(Arrays.equals(X, Y), true);
		//assertEquals(B.size, 0); //Need selector to test this
	}

}
