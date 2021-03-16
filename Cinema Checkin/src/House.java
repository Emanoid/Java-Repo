import java.util.Scanner;
public class House {
	Scanner Emanoid = new Scanner(System.in);
	int age,choice, yes, married, publicschool;
	String choice1, choice2;
		
	public void extraHouse(){
		
	System.out.println("Do you want to watch the Blu Ray version");
	System.out.println("If Yes Enter 1, If No Enter 2");
	choice = Emanoid.nextInt();
		if (choice == 1){
			System.out.println("Enter Room 1 of the Cinema");
		}
		else{
			System.out.println("Enter Room 2 of the Cinema");
		
		}Mstatus();
	}
	
		public void Mstatus(){
			
	System.out.println("Are you married?...");
	System.out.println("if you are Married Enter Married, if you are Single Enter Single");
	choice1 = Emanoid.nextLine();
	if (choice1.equalsIgnoreCase("Married")){
		System.out.println("Im sorry, Married viewers must return to the counter to collect their ticket for next week's Married Citezen's version");
	}
	else if(choice1.equalsIgnoreCase("Single")){
		System.out.println("You are one step away from viewing the movie");
	Icecream IcecreamObject = new Icecream();
	IcecreamObject.SingleCitizens();
	}
	else{
		System.out.println("You made a spelling error");
		Mstatus();
		
	}}
		
		
}


	


