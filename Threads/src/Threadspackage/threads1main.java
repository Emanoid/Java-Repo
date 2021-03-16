package Threadspackage;

public class threads1main
{
public static void main(String[] args){
	thread1 t1 = new thread1();
	t1.start();
	for (int i = 0; i < 20; i++){		
		System.out.println ("This is the MAIN thread: " + i);}}
}