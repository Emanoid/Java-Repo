package Primelessthan_n;

public class PrimeLessThan_n {
	//Purpose: to count the number of primes <=n
	
	public static int primes(int n) {
		boolean[] isPrime = new boolean[n+1];
		//Purpose: To track which natnums <=n are prime
		
		initArray(isPrime, 2, n);
		markNonPrimes(isPrime, 2, n);
		return(countTrue(isPrime, 2,n));
	}
	
	public static void markNonPrimes(boolean[]X, int low, int high) {
		//Purpose. To mark X in the given interval the nonPrimes
		//Assumption: low==2 && 2<k<=high -> X[k]==true
		//Effect: For all i in the given interval that are not prime, X[i] == false
		//Note: the largest multiple of i <=high is i*(high div i)
		//INV: i<= high div i + 1 && X[j] && j in [low..i-1] ==> i is prime
		//X[j]==false && j in [low..i-1]-> j is not prime
		//X[k]==false && k in [i..high]==> k is not prime
		for(int i= 2; i<=high/i; i=i+1) {
			if(X[i]) {markMultiples(X, i, high);}
			}//Termination Argument: i starts begins at 2, every time through the loop i increments by 1
			// eventually i becomes greater than high/i and loop terminates.
		}
	
		public static void markMultiples(boolean[]X, int low, int high) {
		//Purpose: to mark the multiples of low in X
		//Assumption: low is prime
		//Effect: a==low*k==>X[a]==false
			//INV: i<=high/low +1 && k in [low...i-1] -> X[low*k]==false
			for(int i = low;(i<= high/low); i=i+1) {
				X[i*low]=false;	}
		}//Termination Argument: i starts begins at low(where low>=2&&<=high), every time through the loop i increments by 1
		// eventually i becomes greater than high(where high>=2&&>=low)/low and loop terminates.
		
		public static void initArray(boolean[] X, int low, int high)
		//Purpose: to initialize all of X to true in the given vector interval
		//Effect: All elements in the given vector interval are set to true
		{//INV: i<=high+1 && X[low...i-1]==true && low<=i
		for(int i=low; i<=high; i=i+1) {
			//i<=high && X[low...i-1]==true && low<=i
			X[i] = true;
			//i<=high && X[low....i] == true && low <=i
			//i=i+1
			//i<=high + 1 && X[low...i-1]==true && low<=i
		}	
		//i<high + 1 && X[low..i-1]==true && low <=i && i>high
		//==> i=high + 1 ==> X[low..high]==true
		}//Termination Argument: i starts begins at low(where low>=2&&<=high), every time through the loop i increments by 1
		// eventually i becomes greater than high(where high>=2&&>=low) and loop terminates.
		
		public static int countTrue(boolean[]X, int low, int high)
		//Purpose: to count the number of true in X in the given vector interval
		{int res=0; int h = high;
			//INV: h >= low-1 && res = number of true in X[h...high]&& h<=high
		while(low <=h)
		{//h>=low && res = number of true in X[h+1...high] && h<=high
		if(X[h])
		{//h>=low && res = number of true in X[h+1...high] && h<=high && X[h]
			res = res + 1;
		//h>=low && res = number of true in X[h...high] && h<=high && X[h]
		}
		h=h-1;
		//h>= low-1 && res = number of true in X[h+1...high] && h<=high
		//h>= low-1 && res = number of true in X[h+1...high] && h<=high && low>h
		}//==> h = low-1 ==> res= number of true in X[low...high]
		//Termination Argument: h starts begins at high(where high>=2&&>=low), every time through the loop h decrements by 1
		// eventually h becomes less than low(where low>=2&&<=high) and loop terminates.
		return res;
		}
		
		
	}



