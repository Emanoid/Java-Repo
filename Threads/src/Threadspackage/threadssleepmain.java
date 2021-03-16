package Threadspackage;

public class threadssleepmain{
	
	public static void main(String[] args){
		threadsleep t1 = new threadsleep("Marco");
		threadsleep t2 = new threadsleep("Sach");
		threadsleep t3 = new threadsleep("Craig");
		t1.start ();
		t2.start();
		t3.start();
		}}