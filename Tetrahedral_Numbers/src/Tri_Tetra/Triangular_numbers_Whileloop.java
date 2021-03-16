package Tri_Tetra;
import java.util.Scanner;

public class Triangular_numbers_Whileloop {
	public static int Compute(int n) {
		//To compute the nth triangular number
		//INV: accum = (n+(n-1)+...+accum)
		int accum = 0;  //result so far
		while(n!=0) {//loop terminates when n==0
			//accum = N + n //where n is the integer inputed from main and N is the acumulated sum of previous n's
			accum = accum + n;//where accum holds N, accum = N
			//accum = N 
			n =n-1;
			//accum = N + n , where N is previous n
			/*TERMINATION STATEMENT: n begins as an integer >= 0
									 n is decremented by 1 every time through the loop
									 eventually n becomes 0 and the loop stops */
			}return accum;
	}
	
	public static void main(String[] args) {
		Scanner Emanoid = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = Emanoid.nextInt();
		System.out.println(Compute(n));
	}
}
