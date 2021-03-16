package GeometricVisitorPattern;

/**
 * Class for Circle
 * variable r => radius
 */
public class Circle extends aShape{
	
	//Observers
	protected double r;
	
	//Purpose: Implements a Circle
	public Circle(double radius) {
		super(1);
		r=radius;		}
	
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

	@Override
	public <X> X visit(IshapeVisotor<X> V) {
		// TODO Auto-generated method stub
		return V.Circle(r);
	}

	@Override
	public boolean isEllipse() {
		// TODO Auto-generated method stub
		return false;
	}
	public double TOSTRING() {
		return r;
	}
	
	}

