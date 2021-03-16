package Iterator_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx2 {
	
	public static void printArray(ArrayList<Integer> X) {
		Integer val;
		Iterator<Integer> looper = X.iterator();
		
		//INV: looper.hasNext() -> not all elements of X printed
		//&& Elements of X printed are X[0...i-1], i == lopper pos
		//		!looper.hasNext() -> all elements of X printed &&
									//Elements of X printed are 
									//X[0...i-1], i== X.size()
		while (looper.hasNext()) {
			val = looper.next();
			System.out.println(val+ "");
		}
		System.out.println();
	}
	
	public static void scaleVector(ArrayList<Integer> X, int scalar) {
		Integer i; //-1 <= i <= X.sixe() - 1  - index of last element saled
		i = -1;
		//INV: -i <= i <= X.size() - 1 && X[0..i] scaled by scalar
		while(i < X.size() -1) {
			//-I <= I< X.size() - 1 && X[0...i] scaled by scalar
			i = i + 1;
			//0 <= i <= X.size() - 1 && X[0...i-1] scaled by scalar
			X.set(i, new Integer(X.get(i) * scalar)); //Integer objects are immutable
			//-i <= i <= X.size() -1 && X[0...i] scaled by scalar
		}
		// -i <= i <= X.size() - 1 7& X[0...i] scaled by scalar
		//&& i>= X.size() -1 ==> i == X.size() -1 ==> X[0...X.size() - 1] scaled by scalar
		}
	
	public static void scaleVector2(ArrayList<Integer> X, int scalar) {
		int i;// -1 <= i <= X.size() - 1
		Iterator<Integer> looper = X.iterator();
		i = -1;
		//-i <= i <= X.size() -1 && X[0...i] scaled by scalar
		while(looper.hasNext()) {
			//-1 <= i < X.size() - 1 && X[0...i] scaled by scalar
			i = i + 1;
			//0 <= i <= X.size() -1 && X[0....i-1] scaled by scalar
			X.set(i, new Integer(looper.next() * scalar));
			//Integer objects are immutable
			//-1 <= i <= X.size() - 1 && X[0...i] scaled by scalar
		}
		// -1 <= i <= X.size() - 1 && X[0...i] scaled by scalar 
		//&& !looper.hasNext(); -> i = X.len -> X[0...X.size() - 1] scaled by scalar
	}
	
	public static void main(String args[]) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(10);
		A.add(35);
		A.add(15);
		A.add(22);
		A.add(8);
		printArray(A);
		scaleVector(A, 10); //does not use an iterator
		printArray(A);
		scaleVector2(A, 10); //uses an interator
		printArray(A);
		
	}
}
