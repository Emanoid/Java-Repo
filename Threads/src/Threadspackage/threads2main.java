package Threadspackage;

public class threads2main{
	public static void main(String[] args){
	thread2 t1 = new thread2("Marco");
	thread2 t2 = new thread2("Sach");
	thread2 t3 = new thread2("Craig");
	t1.start ();
	t2.start();
	t3.start();
	System.out.println ("This is the MAIN thread");
}}