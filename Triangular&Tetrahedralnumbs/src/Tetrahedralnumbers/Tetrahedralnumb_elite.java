package Tetrahedralnumbers;
import java.util.Scanner;

public class Tetrahedralnumb_elite {//Purpose: To Compute the nth tetrahedral 
	public static int gettetranumb(int N, int n, int tri, int tetra) {//N=>nth value from main
		//tetra: sum(tri(n)), n= 0...N, where tri(n) ==> sum(n), i=0...N
		if(n==N) {return tetra;}//terminates recursion when n increments up to N
		else {return gettetranumb(N, n+1, n+1+tri, (n+1+tri)+tetra);} 
			}
	
	public static void main(String[] args) {
		Scanner Emanoid = new Scanner(System.in);
		int n=0, tri=0, tetra=0;
		System.out.println("Enter the nth integer");
		int N = Emanoid.nextInt();
		System.out.println(gettetranumb(N, n, tri, tetra));
	}}

	/*
 * n	tri		tetra
 * 0	0		0
 * 1	1		1
 * 2	3		4
 * 3	6		10
 * 4	10		20
 * 5	15		35		
 * 
 * n = n + 1
 * tri = n+1+tri	
 * tetra = (n+1+tri)+tetra
 */
