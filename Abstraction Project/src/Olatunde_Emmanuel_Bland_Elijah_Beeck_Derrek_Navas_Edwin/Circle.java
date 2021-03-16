package Olatunde_Emmanuel_Bland_Elijah_Beeck_Derrek_Navas_Edwin;
/**
 * Class for Circle
 * variable r => radius
 */
public class Circle extends aShape{
	
	//Observers
	protected double r;
	
	//Purpose: Implements a Circle
	public Circle(double radius) throws Exception{
		super(1,radius);
		r=radius;	
		if(this.IsZeroInput() == false) {}
		//Throws Exception if a zero input is entered as a dimension
		else{throw new Exception("The shape you entered is invalid => Zero Input");}}
	
				//Methods
	//Purpose: To determine the area of the Circle
	public double area() {
		//EQN Area: PI x R X R
		return (Math.PI * r * r);	}

	//Purpose: To determine the perimeter of the Circle
	public double perimeter() {
		//EQN Perimeter: PI X r X 2
		return (Math.PI* r * 2);	}
	
	//Purpose: To determine if shape is a Qudilateral
	public boolean isQuadrilateral() {
		return false;	}

	//Purpose: To determine if shape is a Triangle
	public boolean isTriangle() {
		return false;}

	//Purpose: To determine if shape is a Circle
	public boolean isCircle() {
		return true;	}
	
	}
