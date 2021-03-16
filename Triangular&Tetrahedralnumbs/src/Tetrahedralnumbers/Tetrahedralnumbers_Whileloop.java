package Tetrahedralnumbers;
import java.util.Scanner;
public class Tetrahedralnumbers_Whileloop {
	public static int trianwhile(int n, int accum) {
		while(n!=0) {
		accum=accum+n;
		n=n-1;
		}return accum;	}
	
	public static int tetrawhile(int n, int accum1) {
		while(n!=0) {
		accum1= trianwhile(n, 0) + accum1;
		n=n-1;
		}return accum1;	}
		
	public static void main(String[] args) {
		int accum1=0, accum=0;
		Scanner Emanoid = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = Emanoid.nextInt();
		System.out.println(tetrawhile(n, accum1));
	}
}
