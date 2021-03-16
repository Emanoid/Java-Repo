import java.util.Scanner;
public class IP {
	public void Escan(){
		 int firdig3,secdig3,realnum1,realnum2,realnum3,thirdig3,fordig3,fifdig3,sixdig3,sevdig3,eigdig3,firdig2,secdig2,thirdig2,fordig2,fifdig2,sixdig2,sevdig2,eigdig2,firdig, secdig,firdig1,secdig1,thirdig1,fordig1,fifdig1,sixdig1,sevdig1,eigdig1, thirdig, fordig, fifdig, sixdig,sevdig,eigdig,firmult,secmult,thirmult,formult,fifmult,sixmult,sevmult,eigmult,firbit,secbit,thirbit,forbit,fifbit,sixbit,sevbit,eigbit,realnum;
				
					Scanner Emanoid = new Scanner(System.in);
					System.out.println("Enter the following for the first Octet set");
						System.out.println("Enter the first binary digit");
						firdig=Emanoid.nextInt();
						System.out.println("Enter the second binary digit");
						secdig=Emanoid.nextInt();
						System.out.println("Enter the third binary digit");
						thirdig=Emanoid.nextInt();
						System.out.println("Enter the fourth binary digit");
						fordig=Emanoid.nextInt();
						System.out.println("Enter the fifth binary digit");
						fifdig=Emanoid.nextInt();
						System.out.println("Enter the sixth binary digit");
						sixdig=Emanoid.nextInt();
						System.out.println("Enter the seventh binary digit");
						sevdig=Emanoid.nextInt();
						System.out.println("Enter the eight binary digit");
						eigdig=Emanoid.nextInt();
						
						System.out.println("Enter the following for the second Octet set");
						System.out.println("Enter the first binary digit");
						firdig1=Emanoid.nextInt();
						System.out.println("Enter the second binary digit");
						secdig1=Emanoid.nextInt();
						System.out.println("Enter the third binary digit");
						thirdig1=Emanoid.nextInt();
						System.out.println("Enter the fourth binary digit");
						fordig1=Emanoid.nextInt();
						System.out.println("Enter the fifth binary digit");
						fifdig1=Emanoid.nextInt();
						System.out.println("Enter the sixth binary digit");
						sixdig1=Emanoid.nextInt();
						System.out.println("Enter the seventh binary digit");
						sevdig1=Emanoid.nextInt();
						System.out.println("Enter the eight binary digit");
						eigdig1=Emanoid.nextInt();
						
						System.out.println("Enter the following for the third Octet set");
						System.out.println("Enter the first binary digit");
						firdig2=Emanoid.nextInt();
						System.out.println("Enter the second binary digit");
						secdig2=Emanoid.nextInt();
						System.out.println("Enter the third binary digit");
						thirdig2=Emanoid.nextInt();
						System.out.println("Enter the fourth binary digit");
						fordig2=Emanoid.nextInt();
						System.out.println("Enter the fifth binary digit");
						fifdig2=Emanoid.nextInt();
						System.out.println("Enter the sixth binary digit");
						sixdig2=Emanoid.nextInt();
						System.out.println("Enter the seventh binary digit");
						sevdig2=Emanoid.nextInt();
						System.out.println("Enter the eight binary digit");
						eigdig2=Emanoid.nextInt();
						
						System.out.println("Enter the following for the fourth Octet set");
						System.out.println("Enter the first binary digit");
						firdig3=Emanoid.nextInt();
						System.out.println("Enter the second binary digit");
						secdig3=Emanoid.nextInt();
						System.out.println("Enter the third binary digit");
						thirdig3=Emanoid.nextInt();
						System.out.println("Enter the fourth binary digit");
						fordig3=Emanoid.nextInt();
						System.out.println("Enter the fifth binary digit");
						fifdig3=Emanoid.nextInt();
						System.out.println("Enter the sixth binary digit");
						sixdig3=Emanoid.nextInt();
						System.out.println("Enter the seventh binary digit");
						sevdig3=Emanoid.nextInt();
						System.out.println("Enter the eight binary digit");
						eigdig3=Emanoid.nextInt();
						
						
						firmult = 128;
						secmult = 64;
						thirmult = 32;
						formult = 16;
						fifmult = 8;
						sixmult = 4;
						sevmult = 2;
						eigmult = 1;
						
								firbit=firdig * firmult;
								secbit=secdig * secmult;
								thirbit=thirdig * thirmult;
								forbit=fordig * formult;
								fifbit=fifdig * fifmult;
								sixbit=sixdig * sixmult;
								sevbit=sevdig * sevmult;
								eigbit=eigdig * eigmult;
								realnum = firbit+secbit+thirbit+forbit+fifbit+sixbit+sevbit+eigbit;
								
								firbit=firdig1 * firmult;
								secbit=secdig1 * secmult;
								thirbit=thirdig1 * thirmult;
								forbit=fordig1 * formult;
								fifbit=fifdig1 * fifmult;
								sixbit=sixdig1 * sixmult;
								sevbit=sevdig1 * sevmult;
								eigbit=eigdig1 * eigmult;
								realnum1 = firbit+secbit+thirbit+forbit+fifbit+sixbit+sevbit+eigbit;
								
								firbit=firdig2 * firmult;
								secbit=secdig2 * secmult;
								thirbit=thirdig2 * thirmult;
								forbit=fordig2 * formult;
								fifbit=fifdig2 * fifmult;
								sixbit=sixdig2 * sixmult;
								sevbit=sevdig2 * sevmult;
								eigbit=eigdig2 * eigmult;
								realnum2 = firbit+secbit+thirbit+forbit+fifbit+sixbit+sevbit+eigbit;
								
								firbit=firdig3 * firmult;
								secbit=secdig3 * secmult;
								thirbit=thirdig3 * thirmult;
								forbit=fordig3 * formult;
								fifbit=fifdig3 * fifmult;
								sixbit=sixdig3 * sixmult;
								sevbit=sevdig3 * sevmult;
								eigbit=eigdig3 * eigmult;
								realnum3 = firbit+secbit+thirbit+forbit+fifbit+sixbit+sevbit+eigbit;
								
								System.out.println("The binary code imputed above represents the IP:-");
									System.out.print(realnum+".");
									System.out.print(realnum1+".");
									System.out.print(realnum2+".");
									System.out.println(realnum3);
							
							Mult MultObject = new Mult();
							MultObject.Plyer();
						
						
	
	}
	

}
