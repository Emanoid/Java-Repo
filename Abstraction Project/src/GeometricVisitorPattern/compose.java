package GeometricVisitorPattern;

public class compose extends aShape {
	private IGeometry a, b;
	
	public compose(IGeometry aa, IGeometry bb) {
		super(0);
		a=aa;
		b=bb;	}

	//Methods
			//Purpose: To determine the area of the Circle
			public double area() {
			//EQN Area: PI x R X R
			return (a.area() + b.area());	}
			
			//Purpose: To determine the perimeter of the Circle
			public double perimeter() {
			//EQN Perimeter: PI X r X 2
			return (a.perimeter()+ b.perimeter());}
			
			//Purpose: To determine if shape is a Qudilateral
			public boolean isQuadrilateral() {
			return false;	}
			
			//Purpose: To determine if shape is a Triangle
			public boolean isTriangle() {
			return false;}
			
			//Purpose: To determine if shape is a Circle
			public boolean isCircle() {
			return false;	}
			
			@Override
			public <X> X visit(IshapeVisotor<X> V) {
				// TODO Auto-generated method stub
				return V.compose(a.visit(V), b.visit(V));
			}

			@Override
			public boolean isEllipse() {
				// TODO Auto-generated method stub
				return false;
			}
			public double TOSTRING() {
				return a.TOSTRING();
			}
}
