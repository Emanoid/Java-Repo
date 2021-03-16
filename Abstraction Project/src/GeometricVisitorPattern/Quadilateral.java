package GeometricVisitorPattern;

/**
 * Abstract Class for Quadilaterals
 * variable l => length
 * variable w => width
 */
public class Quadilateral extends aShape {
	
	//Observers
	protected double l,w;
		
	//Purpose: Implements a Quadilateral
	public Quadilateral(double length, double width) {
		super(4);
		l=length; 
		w=width;	}
	
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
	
	public <X> X visit(IshapeVisotor<X> V) {
		return (V.Quadilateral(this.l,this.w));
	}

	@Override
	public boolean isEllipse() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public double TOSTRING() {
		return l;
	}
	
}

