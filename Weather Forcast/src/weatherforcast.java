import java.util.Scanner;
public class weatherforcast {
	public void pridiction(){
		
		int day,month;
		
			Scanner Emanoid= new Scanner(System.in);
			
		System.out.println("Enter the Day in numerical format :- (mm)");
		day=Emanoid.nextInt();
		
		if(day>31){System.out.println("INVALID INPUT");}
		
		else{
		System.out.println("Enter the Month in numerical format (JAN=1,FEB=2,MAR=3,APR=4,MAY=5,JUN=6,JUL=7,AUG=8,SEP=9,OCT=10,NOV=11,DEC=12)");
		month=Emanoid.nextInt();
		
		if(month>12){System.out.println("INVALID INPUT");}
		
		else{	
		
		if((month==1||  month==2||  month==3) && (day != 21&& day !=24&&day!=27&& day!=30)){
			System.out.println("THE SEASON OF THE DATE YOU ENTERED IS 'Winter'");}
		
			else if((month==4||  month==5||  month==6) && (day != 21&& day !=24&&day!=27&& day!=30)){
				System.out.println("THE SEASON OF THE DATE YOU ENTERED IS 'Spring'");}
		
			else if((month==7||  month==8||  month==9) && (day != 21&& day !=24&&day!=27&& day!=30)){
				System.out.println("THE SEASON OF THE DATE YOU ENTERED IS 'Summer'");}
			
			else if((day==21||day==24||day==27||day==30)&&(month==1||  month==2||  month==3))
			{System.out.println("THE SEASON OF THE DATE YOU ENTERED IS 'Spring'");}
		
			else if((day==21||day==24||day==27||day==30)&&(month==4||  month==5||  month==6))
			{System.out.println("THE SEASON OF THE DATE YOU ENTERED IS 'Summer'");}
		
			else if((day==21||day==24||day==27||day==30)&&(month==7||  month==8||  month==9))
			{System.out.println("THE SEASON OF THE DATE YOU ENTERED IS 'Fall'");}
		
			else if((day==21||day==24||day==27||day==30)&&(month==10||  month==11||  month==12))
			{System.out.println("THE SEASON OF THE DATE YOU ENTERED IS 'Winter'");}
				
			else {System.out.println("THE SEASON OF THE DATE YOU ENTERED IS 'Fall'");}
		
		Extra ExtraObject=new Extra();
		ExtraObject.more();
	}}}}
		
		
		
		


