package Threadspackage;

public class threade extends Thread{ 
	
	public double e; // Purpose: To store the value of e
	
	public threade() {}
	
	public void run () {// e ~= (1 + 1/n)^n
	final double term = 1 + 1/10000.0;
	double res = 1.0; // Purpose: Approximation of e
	int i = 10000; // Purpose: Number of terms remaining to multiply
	// INV: i >= 0 && res = PI_k=i+1..10000
	while (i > 0){
		// i > 0 && res = PI_k=i+1..10000
		res = res * term;
		// i > 0 && res = PI_k=i..10000
		i = i - 1;
		// i >= 0 && res = PI_k=i+1..10000 }
		// i >= 0 && res = PI_k=i+1..10000 && i <= 0
		// ==> i = 0 ==> res = PI_k=1..10000
		e = res; }
	System.out.println("The value of e in thread: " + e);}}