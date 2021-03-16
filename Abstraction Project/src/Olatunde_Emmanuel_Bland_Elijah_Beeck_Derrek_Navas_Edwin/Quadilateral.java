package Olatunde_Emmanuel_Bland_Elijah_Beeck_Derrek_Navas_Edwin;
/**
 * Abstract Class for Quadilaterals
 * variable l => length
 * variable w => width
 */
public abstract class Quadilateral extends aShape {
	
	//Observers
	protected double l,w;
		
	//Purpose: Implements a Quadilateral
	public Quadilateral(double length, double width) throws Exception{
		super(4,length);
		l=length; 
		w=width;	
		if(this.IsZeroInput()) {
			//Throws Exception if a zero input is entered as a dimension
			throw new Exception("The shape you entered is invalid => Zero Input");
		}
	}
	
				//Methods
	//Purpose: To determine the area of the Quadilateral
	public double area() {
		//EQN Area: length X width
		return (l * w);	}
	
	//Purpose: To determine the perimeter of the Quadilateral
	public double perimeter() {
		//EQN Perimeter: (length X 2) + (width X 2)
		return ((l*2)+(w*2));	}	
	
	//Purpose: To determine if shape is a Qudilateral
	public boolean isQuadrilateral() {
		return true;	}

	//Purpose: To determine if shape is a Triangle
	public boolean isTriangle() {
		return false;	}

	//Purpose: To determine if shape is a Circle
	public boolean isCircle() {
		return false;	}	
}
