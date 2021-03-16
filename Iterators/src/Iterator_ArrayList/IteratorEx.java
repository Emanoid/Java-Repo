package Iterator_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
	public static void main(String args[]) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Marco");
		names.add("Nick Olsen");
		names.add("Nick Nelson");
		Iterator<String> looper = names.iterator();//index starts at 0
		
		while(looper.hasNext()) {
			String obj = looper.next(); //next() returns currently indexed element
			System.out.println(obj);
		}
	}
}
