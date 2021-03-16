import java.util.Scanner;
public class content {
	public void solution(){
		double ant,ball,car,xxx,xxy,getSolution1, getSolution2,proof;
		Scanner Emanoid=new Scanner(System.in);
		System.out.println("Your quadratic equation must be in the form ax2+bx+c");
		System.out.println("Hence make sure to solve out your value a,b and c.");
		System.out.print("What is the value of 'a' in your equation:");
		ant=Emanoid.nextDouble();
		System.out.print("What is the value of 'b' in your equation:");
		ball=Emanoid.nextDouble();
		System.out.print("What is the value of 'c' in your equation:");
		car=Emanoid.nextDouble();
		
		xxx= (-ball + Math.sqrt(Math.pow(ball,2) - (4* ant * car)))/(2*ant);
		xxy= (-ball - Math.sqrt(Math.pow(ball,2) - (4* ant * car)))/(2*ant);
		proof= Math.pow(ball, 2)-(4*ant*car);
		
		if(proof<0){System.out.println("There are no real solutions or your equation");}
		
		else{
			getSolution1=Math.min(xxx, xxy);
			getSolution2=Math.max(xxx, xxy);
			System.out.println("The result for x based on your inputed parameters are:");
			System.out.println(getSolution1+" and "+getSolution2);
			System.out.println("I hope this program was useful!!");
			
		}
		
	}

}
