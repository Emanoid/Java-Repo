package INSORT;
//INV: X[h..high] is sorted && X[low-1...h-1] is sorted && low-1 <= h && h<=high && 
	//For all a in [low-1..h-1] and b in [h+1.. high], X[a] <= X[b]
	//Purpose: To sort in nondecreasing order the given array
	//in the given vector interval
	//Effect: the elements in the given vector interval are rearranged in nondecreasing order
public class Insort{
	
	public static void insort(int[]X, int low, int high) {
	int l = low;// Purpose: index of next element to insert into sorted part of the vector interval
	//INV: X[low..l-1] is sorted && low <=l&& l<=high+1
	while(l<=high){
		 //X[low..l-1] is sorted && low <=l && l<=high
		insert(X, low+1, l);
		//X[low..l] is sorted && low <=l && l<=high
		l =l+1 ;
		//X[low..l-1] is sorted && low <=l && l<=high + 1
		}
	/* 
	 * Termination Argument: l starts a low. Every loop iteration increases l by 1
	 * Eventually, l becomes high + 1 and the loop terminates.
	 */
	//X[low..l-1] is sorted && low <=l && l<=high +1 && l>high
	//==> 1 = high + 1 ==> X[low... high] is sorted
}
	public static void insert(int[] X, int low, int high) {
		/*
		 * Assumption
		 */
		int h = high;//Purpose: the index of the element being inserted
		//INV: X[h...high] is sorted &&
		// X[low-1....h-1] is sorted && low -1 <= high && 
		//For all a in [low-1... h-1] and b in [h+1... high], X[a]<=X[b]
		while(low<=h) {
			//INV: X[h...high] is sorted &&
			// X[low-1....h-1] is sorted && low -1 <= high && 
			//For all a in [low-1... h-1] and b in [h+1... high], X[a]<=X[b]
		if(X[h-1] <= X[h]) {
			//X[low-1..h-1] is sorted && X[h-1] <= X[h] && X[h...high] is sorted
			h = low -1;
			//X[low-1...h-1] is sorted && h == low-1
			}
		else {//X[h...high] is sorted && X[low...h-1] is sorted && low -1 < h && 
			//h <= high && X[h-1]>X[h] && For all a in [low-1...h-1] and b in
			//[h+1...high], X[a] <= X[b]
			swap(X,h,h-1);
			h=h-1;		
		}
		} //X[low...high] is sorted
		/*
		 * Termination Argument: h starts at high. Every loop iteration h is set to low-1 and terminates or is
		 * decreased by one & eventually becomes low-1 and terminates
		 */
	}
	
	public static void swap(int[] X, int a, int b) {
		int temp;
		temp= X[a];
		X[a]=X[b];
		X[b]= temp;
	}

}
