import java.math.*;
import java.util.Scanner;
import java.util.Arrays;

public class Prime {
	//Write a program to print out the Prime numbers
	Scanner sc = new Scanner(System.in);
	public void look() {
		System.out.println("Enter the integer of the number you want to check if it is prime");
		int o = sc.nextInt();
		System.out.println("Below is a list of primes from 2 till 35");
		for(int i=1;i<=40;i++) {
		//n+1 is prime iff n!mod(n+1)=n
			if((factorial(i) % (i+1))== i) {System.out.println(i+1);;}
			else {System.out.print("");}
	}
		isprime(o);}
		
	public long factorial(int n) {
		long b=1;
		for(int a=1; a<=n; a++) {
			b=b*a;
				}
		return b;}
	
	public boolean isprime(int c) {
		if((factorial(c-1) % (c))== (c-1)) {System.out.println(c+" is a prime number"); return true;}
		else {System.out.print(c+" is not a prime number"); return false;}
		
	}
	
} 