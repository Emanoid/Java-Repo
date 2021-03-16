package Threadspackage;

public class thread2 extends Thread{
	public thread2(String n){
		super(n);}
	
	public void run(){
	System.out.println ("My name is: " + this.getName());}
}