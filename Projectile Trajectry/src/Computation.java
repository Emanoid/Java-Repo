import java.util.Scanner;
public class Computation {
public void Algorithm(){
	
	
	double inivel,chatime,chadist,lastdist,extravel,lastvel,extradist,one,three,maxheight,maxvel,maxtime,time;
	String notravel;
	Scanner Emanoid= new Scanner(System.in);
	
	System.out.println("Input the initial velocity in m/s");
	inivel=Emanoid.nextDouble();
	
	notravel="Negligible Velocity";
	System.out.println("The value 0.1919 in the Velocity Section means "+ notravel);
		
	lastdist=0;one=0;three=0;
	System.out.printf("Distance above Ground:%10.7f\tTime:%4.7f\tVelocity:%8.7f\n", one,three,inivel);

	time=0;
	chatime=1;
	for(lastvel=inivel-9.81;lastvel>=0;lastvel-=(9.81 * chatime)){
		chadist= lastdist + (lastvel * chatime);
		lastdist=chadist;
		chatime++;
		time++;
		System.out.printf("Distance above Ground:%10.7f\tTime:%4.7f\tVelocity:%8.7f\n", lastdist,time,lastvel);}
	
	maxtime= inivel/9.81;
	for(Double i=time+1;i<maxtime;i++){
		extradist=-0.5 *9.81* Math.pow(i, 2) + (inivel * i);
		extravel=0.1919;
		if(extravel<0){System.out.printf("Distance above Ground:%10.7f\tTime:%4.7f\tVelocity:%8.7f\n", extradist,i,extravel);}else{
		System.out.printf("Distance above Ground:%10.7f\tTime:%4.7f\tVelocity:%8.7f\n", extradist,i,extravel);}}	
	
	maxheight=Math.pow(inivel, 2)/ (2 * 9.81);
	maxvel=0;		
	System.out.printf("Distance above Ground:%10.7f\tTime:%4.7f\tVelocity:%8.7f\n", maxheight,maxtime,maxvel);
	
}}

