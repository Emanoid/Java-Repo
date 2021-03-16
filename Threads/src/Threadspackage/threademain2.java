package Threadspackage;

public class threademain2
{ public static void main(String[] args){
	threade t1 = new threade(); //A thread to compute e
	t1.start ();
	try	{ 
		Thread.sleep(100); }// Hopefully enough time?
	catch(InterruptedException e) { }
	System.out.println("The value of e in Main : " + t1.e);	}
	}
