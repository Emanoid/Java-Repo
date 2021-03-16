package Threadspackage;

public class threademain3{
	public static void main(String[] args){
	threade t1 = new threade(); //A thread to compute e
	t1.start ();
	while (t1.isAlive()){
		try{
			Thread.sleep(100); }
		catch(InterruptedException e) {}}
		System.out.println("The value of e in Main : " + t1.e);	}
	}
