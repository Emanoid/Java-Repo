package Interfaces;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void test() throws Exception{
				Inatnum zero = new zeronatnum();Inatnum one= zero.succ(); Inatnum two = zero.succ().succ();
				Inatnum three = two.succ();Inatnum four = two.succ().succ();
				assertEquals(zero.getVal(), 0);
				assertEquals(two.getVal(), 2);
				assertEquals(zero.isZero(), true);
				assertEquals(two.isZero(), false);
				assertEquals(zero.equal(zero), true);
				assertEquals(two.equal(zero), false);
				assertEquals(two.add(two).equal(four), true);
				assertEquals(zero.add(two).getVal(), 2);
				try {assertEquals(two.pred().getVal(), 1);}
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				//try {assertEquals(zero.pred().getVal(), "");}
				//catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				assertEquals(zero.succ().getVal(), 1);
				assertEquals(two.succ().getVal(), 3);
				try{assertEquals(zero.lessthan(two), true);}
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				try{assertEquals(zero.lessthan(zero), false);}
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				try{assertEquals(two.lessthan(zero), false);}
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				try{assertEquals(two.lessthan(four), true);   }
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				try{assertEquals(zero.greaterthan(two), false);}
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				try{assertEquals(zero.greaterthan(zero), false);}
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				try{assertEquals(two.greaterthan(zero), true);}
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				try{assertEquals(two.greaterthan(four), false);}
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				try{assertEquals(zero.leq(two), true);}
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				try{assertEquals(zero.leq(zero), true);}
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				try{assertEquals(two.leq(two), true);}
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				try{assertEquals(two.leq(zero), false);}
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				try{assertEquals(zero.geq(two), false);}
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				try{assertEquals(zero.geq(zero), true);}
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				try{assertEquals(two.geq(two), true);}
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				try{assertEquals(two.geq(zero), true);}
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				try{assertEquals(two.geq(four), false); }
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				try{assertEquals(four.subtract(two).equal(two),true);}
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				try{assertEquals(four.subtract(zero).equal(two),true);}
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				try{assertEquals(zero.subtract(zero).equal(four),false);}
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				assertEquals((four.remainder(two)).getVal(), 0);
				assertEquals((four.remainder(three)).getVal(), 1); 
				assertEquals((zero.remainder(zero)).getVal(), 0);
				assertEquals((zero.remainder(four)).getVal(), 0);
				assertEquals((zero.remainder(zero)).getVal(), 0);
				assertEquals((zero.remainder(four)).getVal(), 0);
				assertEquals(zero.multiply(zero).getVal(), 0);
				assertEquals(zero.multiply(two).getVal(), 0);
				assertEquals(two.multiply(four).getVal(), 8);
				assertEquals(two.multiply(zero).getVal(), 0); 
				try{assertEquals(zero.quotient(zero).getVal(), 0);}
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				try{assertEquals(zero.quotient(two).getVal(), 0);}
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				try{assertEquals(two.quotient(zero).getVal(), 0);}
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				try{assertEquals(four.quotient(two).getVal(), 2);}
				catch(Exception e) {System.out.println("Error: " + e.getMessage());}
				assertEquals(zero.ToString(), "Natural Number: "+0+"");
				assertEquals(four.ToString(), "Natural Number: "+4+" and Predecessor: "+3+"");
				assertEquals(four.print(), four);
				assertEquals(zero.print(), zero);
				
				System.out.println("This is a test for the factorial of an Inatnum");
				Scanner in = new Scanner(System.in);
				System.out.print("Enter a Natural Number: ");
				int input = in.nextInt();
				if(input!=0) {
				//Factorial Test for nonzero Inatnum
				System.out.println(nonzeronatnum.factorial(input).ToString());}
				else {
				//Factorial Test for zero Inatnum
				System.out.println(zeronatnum.factorial().ToString());
				
				}

							
				}


}