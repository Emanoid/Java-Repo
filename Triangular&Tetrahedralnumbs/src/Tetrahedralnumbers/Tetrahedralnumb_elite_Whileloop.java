package Tetrahedralnumbers;
import java.util.Scanner;
public class Tetrahedralnumb_elite_Whileloop {
	
	public static int gettetranumbwhile(int N, int n, int tri, int tetra) {//Purpose:To compute the nth tetrahedral
		//INV: tetra = sum(tri(n)) n=> 0...(N+1), where tri(n) = sum(n) n=> 0....(N+1)
		while(n!=(N)){//n starts off as zero from main
			tetra= n+1+tri+tetra; //computes the nth tetrahedral
			//tetra = sum(tri(n)) n=> 0...(n+1), where tri(n) = sum(n) n=> 0....(n)
			tri=n+1+tri;  //computes the nth triangular 
			//tetra = sum(tri(n)) n=> 0...(n+1), and tri(n+1) = sum(n) n=> 0....(n+1)
			n=n+1; //increments n by 1
			//tetra = sum(tri(n)) n=> 0...(n), and tri(n-1) = sum(n) n=> 0....(n-1)
		/*
		 * Termination Statement: n starts off the loop as zero and increments by one each time through the loop
		 * 						  evenutually, n becomes equal to (N+1) and the loop terminates
		 */
			}
		return tetra; //returns the nth tetrahedral
	}
	
	public static void main(String[] args) {
		Scanner Emanoid = new Scanner(System.in);
		int n=0, tri=0, tetra=0;
		System.out.println("Enter the nth integer");
		int N = Emanoid.nextInt();
		System.out.println(gettetranumbwhile(N, n, tri, tetra));
	}
}

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
* tetra = n+1+tri+tetra
*/
