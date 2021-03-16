package Tetrahedralnumbers;
import java.util.Scanner;

public class Tetrahedralnumb_Recursion {
	public static int triangrec(int n, int accum) {
		if(n==0) {return accum;}
		else { accum = n + accum;
			return triangrec(n-1, accum);}
	}
	
	public static int tetrarec(int n, int accum1) {
		if(n==0) {return accum1;}
		else {accum1= triangrec(n, 0) + accum1;
			return tetrarec(n-1, accum1);}
	}
	
	public static void main(String[] args) {
		Scanner Emanoid = new Scanner(System.in);
		int accum1= 0;
		System.out.println("Enter the integer");
		int n = Emanoid.nextInt();
		System.out.println(tetrarec(n, accum1));
	}
}
