import java.util.Scanner;
public class ClassB {
public void UnitConverter(){
	Scanner Emanoid=new Scanner(System.in);
	int one,two;
	double value,three;
	
	System.out.println("These Unit Converter program can only run for:kilometer,meter,feet,inch,centimeter,millimeter and minimillimeter.");
	System.out.println("Insert the units with the corresponding numbers they printed with below");
	System.out.println(" 																									");
	System.out.println("kilometer=1");
	System.out.println("meter=2");
	System.out.println("feet=3");
	System.out.println("inch=4");
	System.out.println("centimeter=5");
	System.out.println("millimeter=6");
	System.out.println("minimillimeter=7");
	System.out.print("Convert from:");
	one=Emanoid.nextInt();
	System.out.print("Convert to:");
	two=Emanoid.nextInt();
	System.out.print("Value:");
	three=Emanoid.nextDouble();
	
	if((one==3||one==4||one==5||one==2||one==1||one==6||one==7)&&(two==3||two==4||two==5||two==2||two==1||two==6||two==7)){
	
		if(one==3& two==4){
		value=three*12;
		System.out.println(value);
	}
	else if(one==3& two==5){
		value=three*0.667;
		System.out.println(value);
	}
	else if(one==3& two==6){
		value=three*0.0667;
		System.out.println(value);
	}
	else if(one==3& two==7){
		value=three*0.00667;
		System.out.println(value);
	}
	else if(one==3& two==2){
		value=three*5.556;
		System.out.println(value);
	}
	else if(one==3& two==1){
		value=three*5555.56;
		System.out.println(value);
	}
	else if(one==4& two==6){
		value=three*15;
		System.out.println(value);
	}
	else if(one==4& two==7){
		value=three*150;
		System.out.println(value);
	}
	else if(one==4& two==3){
		value=three/12;
		System.out.println(value);
	}
	else if(one==4& two==5){
		value=three*1.5;
		System.out.println(value);
	}
	else if(one==4& two==2){
		value=three/66.667;
		System.out.println(value);
	}
	else if(one==4& two==1){
		value=three/66666.67;
		System.out.println(value);
	}
	else if(one==5& two==4){
		value=three/1.5;
		System.out.println(value);
	}
	else if(one==5& two==6){
		value=three*10;
		System.out.println(value);
	}	
	else if(one==5& two==3){
		value=three/0.667;
		System.out.println(value);
	}
	else if(one==5& two==7){
		value=three*100;
		System.out.println(value);
	}
	else if(one==5& two==2){
		value=three/100;
		System.out.println(value);
	}
	else if(one==5& two==1){
		value=three/1000;
		System.out.println(value);
	}
	else if(one==6& two==5){
		value=three/10;
		System.out.println(value);
	}
	else if(one==6& two==7){
		value=three*10;
		System.out.println(value);
	}
	else if(one==6& two==4){
		value=three/15;
		System.out.println(value);
	}
	else if(one==6& two==3){
		value=three/0.0667;
		System.out.println(value);
	}
	else if(one==6& two==1){
		value=three/10000;
		System.out.println(value);
	}
	else if(one==6& two==2){
		value=three/1000;
		System.out.println(value);
	}
	else if(one==7& two==6){
		value=three/10;
		System.out.println(value);
	}
	else if(one==7& two==5){
		value=three/100;
		System.out.println(value);
	}
	else if(one==7& two==4){
		value=three/150;
		System.out.println(value);
	}
	else if(one==7& two==3){
		value=three/0.00667;
		System.out.println(value);
	}
	else if(one==7& two==2){
		value=three/10000;
		System.out.println(value);
	}
	else if(one==7& two==1){
		value=three/100000;
		System.out.println(value);
	}
	else if(one==2& two==1){
		value=three/1000;
		System.out.println(value);
	}
	else if(one==2& two==3){
		value=three*5.556;
		System.out.println(value);
	}
	else if(one==2& two==4){
		value=three*66.667;
		System.out.println(value);
	}
	else if(one==2& two==5){
		value=three*100;
		System.out.println(value);
	}
	else if(one==2& two==6){
		value=three/1000;
		System.out.println(value);
	}
	else if(one==2& two==7){
		value=three/10000;
		System.out.println(value);
	}
	else if(one==1& two==2){
		value=three*1000;
		System.out.println(value);
	}
	else if(one==1& two==3){
		value=three*5555.56;
		System.out.println(value);
	}
	else if(one==1& two==4){
		value=three*66666.67;
		System.out.println(value);
	}
	else if(one==1& two==5){
		value=three*10000;
		System.out.println(value);
	}
	else if(one==1& two==6){
		value=three*100000;
		System.out.println(value);
	}
	else{
		value=three*1000000;
		System.out.println(value);}
	
	}
	else{System.out.println("INVALID INPUT");}
	
	System.out.println("Hope this program has been useful");
		
}
}
