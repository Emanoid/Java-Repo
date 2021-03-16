package Threadspackage;
public class thread1 extends Thread{
	
	public void run(){
		for (int i = 0; i < 20; i = i + 1){
			System.out.println ("This is the OTHER thread: " + i);}	}
	}