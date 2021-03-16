import java.util.Random;
	import java.util.Scanner;

	public class Main {
		public static void main(String[] args) {
			Scanner Emanoid = new Scanner(System.in);
			System.out.println("Applications to run:");
			System.out.println("1. Prime Number Detector");
			System.out.println("2. FizzBuzz divisors of threes/fives or both");
			System.out.println("3. Fibonachi term Extractor");
			System.out.println("4. Palindrome Detector");
			System.out.println("5. Fibonnachi sum of even terms:limit n");
			System.out.println("6. GCD of two integers");
			System.out.println("7. Kilo Logic Calculator");
			System.out.println("Type the number(numerical form) of the Application you want to run:");
			int choice = Emanoid.nextInt();
			if(choice==1) {
				Prime PrimeObject = new Prime();
				PrimeObject.look();
			}
			else if(choice==2) {
				System.out.println("Enter the number you want to check: ");
				int number=Emanoid.nextInt();
				FizzndBuzz CheckDivisor = new FizzndBuzz(number);
					}
			else if(choice==3) {
				System.out.println("Enter the fibbonachi term number to obtain the fibonachi term: ");
				int number=Emanoid.nextInt();
				Fibbonachi Emanoi = new Fibbonachi(number);
				System.out.println(Emanoi.Fibbonachil(number));	}
			else if(choice==4) {
				System.out.println("This program is a tool you can use to determine if a word is a palindrome");
				Palindrome Emnoid = new Palindrome();
			}
			else if(choice==5) {
				System.out.println("Enter the number limit to calculate the sum of even ");
				System.out.println("fibonnachi numbers before the limit:");
				int number= Emanoid.nextInt();
				FibonnachiSum Eanoid = new FibonnachiSum(number);
			}
			else if(choice==6) {
				System.out.println("This program is a tool to determine the GCD between two numbers");
				System.out.println("Enter the first number: ");
				int first = Emanoid.nextInt();
				System.out.println("Enter the second number: ");
				int second = Emanoid.nextInt();
				GCD Emanoid1 = new GCD(first, second);
				System.out.println(Emanoid1.getGGCD(first, second));	
				//System.out.println(Emanoid1.gcd(first, second));
			}
			else if(choice==7) {
				System.out.println("This program helps determine if x number(s) of 1 kilo(s) of rice and");
				System.out.println("y number(s) of 5 kilo(s) of rice will be able to attain a z kilo goal");
				System.out.println("Enter the first integer x for the number of 1 kilo(s) rice set(s)");
				int x = Emanoid.nextInt();
				System.out.println("Enter the second integer y for the number of 5 kilo(s) rice set(s)");
				int y = Emanoid.nextInt();
				System.out.println("Enter the third integer z for the goal kilo(s) of rice");
				int z = Emanoid.nextInt();
				PackageRiceBags PackageRiceBagsObject = new PackageRiceBags();
				PackageRiceBagsObject.check(x,y,z);
			}
			else {System.out.println("You entered an INVALID number...");}
			
				}
		}