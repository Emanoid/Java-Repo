import java.util.Scanner;
public class Icecream {
	public void SingleCitizens(){
		Scanner Emanoid = new Scanner(System.in);
		String choice3;
		System.out.println("Did you attend a Public High School or a Private one");
		System.out.println("If you attended a Public one Enter Public, if Private Enter Private");
		choice3 = Emanoid.nextLine();
		if (choice3.equalsIgnoreCase("Public")){
			System.out.println("You can watch the Movie Now, Sit Down");
		}
		else{
			System.out.println("I regret to Inform you that you do not qualify to watch this kind of Movie");}


		
	}

}
