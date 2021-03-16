import java.util.Scanner;
public class Mult {
	public void Plyer(){
	

	String  Excellent,Normal, Angry;
	
	Scanner in = new Scanner(System.in);
	
		System.out.println("If you think the Binary Converter is perfect type 'Perfect'");
		System.out.println("If you think the Binary Converter is good but there is room for more improvement type 'Good'");
		System.out.println("If you think the Binary Converter is Terrible type 'Bad'");	
			Excellent=in.nextLine();
		
		if(Excellent.equalsIgnoreCase("Perfect")){
			System.out.println("We appriciate your comments");	
		}
		else if(Excellent.equalsIgnoreCase("Good")){
			System.out.println("Thanks for notifying us, Please write your suggestions here:- ");
			}
			else{
			System.out.println("Thanks for notifying us, Please write your complaints here:- ");
		}
			Angry=in.nextLine();
			System.out.println("Your imput has been saved, Please leave the computer as it is...., ");
			System.out.print("Thanks for you cooperation!!!!!");
	}
}
