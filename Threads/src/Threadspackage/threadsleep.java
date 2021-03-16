package Threadspackage;
import java.util.Random;

public class threadsleep extends Thread{
	
	public threadsleep(String n) { 
		super(n); }
	
	public void run (){
		Random R = new Random();
		boolean leave = false;
		System.out.println(this.getName() + " is at the party");
		while (!leave){
			try	{
				if (R.nextInt() % 10 < 3){
					System.out.println(this.getName() + " is gonna snooze");
					Thread.sleep(1000); 
					// sleep is a static method; must use from class
					System.out.println(this.getName() + " woke up"); }
				else {
					System.out.println(this.getName() + " is partying"); }
				if (R.nextInt() % 10 > 8){
					leave = true; } }
				catch(InterruptedException e) {} }
				System.out.println (this.getName() + " is out of here!"); } } 