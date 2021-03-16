import java.util.Scanner;
import java.lang.reflect.*;
import javax.swing.*;
public class Computation {
	public void IP(){
		int forbit20,firbit21,forbit21,forbit30,forbit31,forbit40,forbit41,forbit50,forbit51,forbit60,forbit61,forbit70,forbit71,forbit80,forbit81,firbit20,firbit30,firbit31,firbit40,firbit41,firbit50,firbit51,firbit60,firbit61,firbit70,firbit71,firbit80,firbit81,secbit21,secbit20,secbit30,secbit31,secbit40,secbit41,secbit50,secbit51,secbit60,secbit61,secbit70,secbit71,secbit80,secbit81,thirbit21,thirbit20,thirbit30,thirbit31,thirbit40,thirbit41,thirbit50,thirbit51,thirbit60,thirbit61,thirbit70,thirbit71,thirbit80,thirbit81;
		int  firset,secset,thirset,forset,firbit90,secbit90,thirbit90,forbit90,firbit91,secbit91,thirbit91,forbit91;
		
			Scanner Emanoid = new Scanner(System.in);
				System.out.println("Enter first IP number set");
				firset=Emanoid.nextInt();
				System.out.println("Enter second IP number set");
				secset=Emanoid.nextInt();
				System.out.println("Enter third IP number set");
				thirset=Emanoid.nextInt();
				System.out.println("Enter fourth IP number set");
				forset=Emanoid.nextInt();
					
					firbit20=firset%2;
					firbit21=firset/2;	
					firbit30=firbit21%2;
					firbit31=firbit21/2;
					firbit40=firbit31%2;
					firbit41=firbit31/2;
					firbit50=firbit41%2;
					firbit51=firbit41/2;
					firbit60=firbit51%2;
					firbit61=firbit51/2;
					firbit70=firbit61%2;
					firbit71=firbit61/2;
					firbit80=firbit71%2;
					firbit81=firbit71/2;
					firbit90=firbit81/2;
					firbit91=firbit81/2;
					//firbit20.....firbit90, starting from firbit80
					
					secbit20=secset%2;
					secbit21=secset/2;
					secbit30=secbit21%2;
					secbit31=secbit21/2;
					secbit40=secbit31%2;
					secbit41=secbit31/2;
					secbit50=secbit41%2;
					secbit51=secbit41/2;
					secbit60=secbit51%2;
					secbit61=secbit51/2;
					secbit70=secbit61%2;
					secbit71=secbit61/2;
					secbit80=secbit71%2;
					secbit81=secbit71/2;
					secbit90=secbit81%2;
					secbit91=secbit81/2;
					//secbit20.....secbit90, starting from secbit80
					
					thirbit20=thirset%2;
					thirbit21=thirset/2;
					thirbit30=thirbit21%2;
					thirbit31=thirbit21/2;
					thirbit40=thirbit31%2;
					thirbit41=thirbit31/2;
					thirbit50=thirbit41%2;
					thirbit51=thirbit41/2;
					thirbit60=thirbit51%2;
					thirbit61=thirbit51/2;
					thirbit70=thirbit61%2;
					thirbit71=thirbit61/2;
					thirbit80=thirbit71%2;
					thirbit81=thirbit71/2;
					thirbit90=thirbit81%2;
					thirbit91=thirbit81/2;
					//thirbit20.....thirbit90, starting from thirbit80
					
					forbit20=forset%2;
					forbit21=forset/2;
					forbit30=forbit21%2;
					forbit31=forbit21/2;
					forbit40=forbit31%2;
					forbit41=forbit31/2;
					forbit50=forbit41%2;
					forbit51=forbit41/2;
					forbit60=forbit51%2;
					forbit61=forbit51/2;
					forbit70=forbit61%2;
					forbit71=forbit61/2;
					forbit80=forbit71%2;
					forbit81=forbit71/2;
					forbit90=forbit81%2;
					forbit91=forbit81/2;
					//forbit20.....forbit90,starting form forbit80
					
					System.out.println("The IP ADRESS IS WRITTEN PRINTED BELOW IN BINARY CODES");
					
					System.out.print(firbit90);
					System.out.print(firbit80);
					System.out.print(firbit70);
					System.out.print(firbit60);
					System.out.print(firbit50);
					System.out.print(firbit40);
					System.out.print(firbit30);
					System.out.print(firbit20);
					System.out.print(".");
					System.out.print(secbit90);
					System.out.print(secbit80);
					System.out.print(secbit70);
					System.out.print(secbit60);
					System.out.print(secbit50);
					System.out.print(secbit40);
					System.out.print(secbit30);
					System.out.print(secbit20);
					System.out.print(".");
					System.out.print(thirbit90);
					System.out.print(thirbit80);
					System.out.print(thirbit70);
					System.out.print(thirbit60);
					System.out.print(thirbit50);
					System.out.print(thirbit40);
					System.out.print(thirbit30);
					System.out.print(thirbit20);
					System.out.print(".");
					System.out.print(forbit90);
					System.out.print(forbit80);
					System.out.print(forbit70);
					System.out.print(forbit60);
					System.out.print(forbit50);
					System.out.print(forbit40);
					System.out.print(forbit30);
					System.out.println(forbit20);
					
					Comment CommentObject = new Comment();
					CommentObject.Plyer();
					
					
					
				
				
	}

}
