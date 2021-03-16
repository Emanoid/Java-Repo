package Tringularnumbers;
import java.util.Scanner;
public class Triangularnumb_Recursion {
	
	public static int triangrec(int n, int accum) {
		//To compute the triangular number from the interger n from main
		//INV: accum: n + (n-1)+...+0.
		//accum = n + N, WHhere N = Summation of (n-1)..0
		if(n==0) {return accum;}
		//returns the result at this point accum==>0
		//accum = n + N
		else { accum = n + accum; // accum represents N ->representation of summation of prefers alphaboys
		//accum = n + N
			return triangrec(n-1, accum);}  //recursive call that terminates when n==0
	}
	
	public static void main(String[] args) {
		Scanner Emanoid = new Scanner(System.in);
		int accum = 0;
		System.out.println("Enter the integer");
		int n = Emanoid.nextInt();
		System.out.println(triangrec(n, accum));
	}
}
