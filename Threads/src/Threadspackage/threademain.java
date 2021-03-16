package Threadspackage;

public class threademain{
	public static void main(String[] args)	{
		
	threade t1 = new threade(); // A thread to compute e
	t1.start ();
	
	System.out.println("The value of e in Main : " + t1.e);	}
	}