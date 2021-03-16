package INSORT;

	import java.lang.reflect.Array;
	import java.util.Arrays;

public class Insort_2_0 {
	//Purpose: To sort a select bound within an array of integers in ascending order and return the sorted array
	public static int[] sort(int[] A, int low, int high) {//low=lower boundary && high = upper boundary
		int l = low; int h = high;	
		//INV: i>=l && i<=h, A{l,....,i-1} is sorted && A[i+,....,h] is not sorted
		for(int i=l; i<=h;i++) {
			//i indexes next element to added into sorted portion
		//INV: i>=l && i<=h, A{l} is sorted && A[i+1,....,h] is not sorted
			sorter(A, l, i); 
		//INV: i>=l && i<=h, A{l,....,i} is sorted && A[i+1,....,h] is not sorted
		//i++
		//INV: i+1>=l && i+1<=h, A{l,....,(i+1-1} is sorted && A[i+1,....,h] is not sorted
		}//INV: i>=l && i<=h, A{l,....,i-1} is sorted && A[i,....,h] is not sorted
			// i>l && i<=h ==> i==h, A{l,......h} is sorted
		//Termination Argument: i starts at l(low), i increments each time through the loop,
		//eventually,i becomes >h(high) and loop terminates
		return A;  //returns sorted array   
	}  
	//Purpose: To compare two elements in the the array bounds and swap if high <= low
	public static void sorter(int[] A, int low, int high) {
	//INV: i>=low+1 && i <= high, low<i A[i-1,i,...,high] is sorted	
		for(int i=high;i>=low+1;i--) {
			//i indexes next element to be added into the sorted portion
	//INV: i>=low+1 && i <= high, low<i	
			if(A[i]>=A[i-1]) {i = low;}	//does not swap the array => leaves elements in their position
	//INV: i<low+1 && i <= high, low!< i A[i-1,i, high] is sorted	
			else {swap(A, i-1, i);} //swaps the elements of the array with index i-1 and i
	//INV: i>=low+1 && i <= high, low<=i A[i-1,i, high] is sorted	
	//i--
	//INV: i-1>=low+1 && i-1 <= high, low<=i-1 A[i-2,i-1,i,high] is sorted
	//INV: i>=low+1 && i <= high, low<=i A[i-1,i,..,high] is sorted	
	}//i<h && i-1>=low==> i-1 == low A[low,....,high] is sorted
		//Termination Argument: i starts at high and decrements each time through the loop, 
		//eventually i < low +1 and loop terminates
	}
	//Purpose: To swap elements in an array
	public static void swap(int [] A, int x, int y) {
		int temp=A[x]; 	//keeps value of element with array index x in temp variable
		A[x]=A[y]; //Makes A[x], A[y]
		A[y]=temp; //Makes A[y], A[x]
		}
	public static void main(String[] args) {
		int [] A = {2,4,23,54,12,58,65,97,13,53};
 		System.out.println(Arrays.toString(sort(A, 3,6)));
 	//	Arrays.sort(A);
 	//	System.out.println((Arrays.toString(A)));
	}
	
}
