package Tetrahedralnumbers;

public class Array {
	public static int sumIntArray(int[] X, int low, int high)
//Purpose: To compute the sum the given array for the given vector interval
	{
		if(low>high) {return 0;}
		else {return(X[high] + sumIntArray(X, low, high-1));}
	}
	public static int sumIntArraywhile(int[] X, int low, int high) {
		//Purpose: To compute the sum the given array for the given vector interval
		int h=high;//Purpose. index of next element to add
		int res = 0; //Purpose. the sum so far
		//INV: res= SUM X(i), i= h+1.. high && h<=high && low-1 <=h
		while(!(low>h)){//the same as (low <= h)
		// res= SUM X(i), i= h+1.. high && h<=high && low-1 < h&& low <=h
		res = X[h] + res;
		// res= SUM X(i), i= h.. high && h<=high && low-1 < h&& low <=h
		h=h-1;
		// res= SUM X(i), i= h+1.. high && h<=high && low-1 <=h			
		}
		// res= SUM X(i), i= h+1.. high && h<=high && low-1 < h&& low >h
		//==> h = low -1 ==> res= SUM X[i], i= low... high
		return(res);
		//TERMINATION ARGUMENT: h starts at high. Every time through the loop h is 
		// decreased by 1. Eventually, it becomes low-1 and the loop terminates.
	}
}
