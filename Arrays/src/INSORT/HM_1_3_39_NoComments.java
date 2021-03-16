package INSORT;
import java.util.Random;

public class HM_1_3_39_NoComments {
	Random rand = new Random();
	public static double sixtimedice(){
		Random rand = new Random();
		int counter = 0;
		for(int i=0; i<=5; i++) {
			int res = rand.nextInt(7);
			if (res==1) {counter= res + counter;}
		}return counter;
	}
	
	public static double twelvetimedice() {
		Random rand1 = new Random();
		double counter1 = 0;
		for(int i=0; i<=11;i++) {
			int res1 = rand1.nextInt(13);
			if(res1==2) {counter1 = 0.5 + counter1;}
		}return counter1;
	}
	
	public static String pepys() {
		boolean[] A = new boolean[100];
		for(int i=0;i<=A.length-1;i++) {
			if(sixtimedice()>twelvetimedice()) {
				A[i]= true;}
			else {A[i]= false;}
			// System.out.println(A[i]);
		}
		count_true(A);
		if(count_true(A)>50) {return "It is more likely to get 1 at least once when rolling 6 times than to get 1 at least twice when rolling 12 times";}
		else {return "It is more likely to get 1 at least twice when rolling 12 times than to get 1 at least once when rolling 6 times";}	
			}
	
	public static int count_true(boolean[] A) {
		int counter3=0;
		for(int i=0; i<=A.length-1;i++) {
			if(A[i]) { counter3 = counter3 + 1;}
		}return counter3;
	}
	
	public static void main(String[] args) {
		System.out.println(pepys());
		
	}
}
