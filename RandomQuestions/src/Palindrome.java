import java.util.Scanner;
import java.lang.Math;

public class Palindrome {
	public Palindrome() {
		next();
		next();
		next();
}
	public void next() {
		Scanner Emanoid= new Scanner(System.in);
		String word = Emanoid.next();
		int wordlength = word.length();
		String reverse1 = (new StringBuffer(word.substring((wordlength/2),(wordlength-0))).reverse().toString()).toLowerCase();
		String reverse11 = (word.substring(0,((wordlength/2)-0))).toLowerCase();
		String reverse22 = (word.substring(0,((wordlength/2)+0))).toLowerCase();
		String reverse2 = (new StringBuffer(word.substring(((wordlength/2)+1),wordlength)).reverse().toString()).toLowerCase();
			
		if((wordlength%2==0)&&(reverse11.contentEquals(reverse1))) {
			System.out.println("Word "+word+" is a Palindrome");
			System.out.println(reverse11);
			System.out.println(reverse1);
			System.out.println(wordlength%2);	
		}
			else if(((wordlength%2)!=0)&&(reverse22.contentEquals(reverse2)))
					{System.out.println("Word "+word+" is a Palindrome");
					System.out.println(reverse22);
					System.out.println(reverse2);
					System.out.println(wordlength%2);
					}
			else {System.out.println("Is not a Palindrome");}
	}
}

/*
 	
		if(	((wordlength%2)==0)&&((word.substring(0,((wordlength/2)-1)))==word.substring((wordlength/2),(wordlength-1)))) {
			System.out.println(word+"is a Palindrome=");}
			else if(((wordlength%2)!=0)&&((word.substring(0,((Math.ceil(wordlength/2))-2)))==((word.substring(Math.ceil(wordlength/2)),(wordlength-1))))
					{System.out.println(word+"is a Palindrome");}
			else {System.out.println("Is not a Palindrome");}
		}
 */
