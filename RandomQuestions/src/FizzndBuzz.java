
public class FizzndBuzz {
	/*Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
For numbers which are multiples of both three and five return 'FizzBuzz'.
For numbers that are neither, return the input number.*/
	int b;
	
		public FizzndBuzz(int n) {
			this.b= n;
			if( ((n%3)==0) && ((n%5)==0) ){System.out.println("FizzBuzz");}
			else if((n%3)==0) {System.out.println("Fizz");}
			else if((n%5)==0) {System.out.println("Buzz");}
			else {System.out.println(n);}
		}
}
