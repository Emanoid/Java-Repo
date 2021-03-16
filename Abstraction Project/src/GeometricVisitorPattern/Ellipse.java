package GeometricVisitorPattern;

public class Ellipse extends aShape{
	
	private static double PI = 3.14;
	private double alen, blen;
	
	public Ellipse(double a, double b) {
		super(1);
		alen = a;
		blen = b;
	} 
	
			//Methods
		//Purpose: To determine the area of the Circle
		public double area() {
		//EQN Area: PI x R X R
		return (Math.PI * alen * blen);	}
		
		//Purpose: To determine the perimeter of the Circle
		public double perimeter() {
		//EQN Perimeter: PI X r X 2
		return (4 * (alen + blen) * Math.pow(PI/4, (4*alen*blen)/((alen+blen)*(alen+blen))));	}
		
		//Purpose: To determine if shape is a Qudilateral
		public boolean isQuadrilateral() {
		return false;	}
		
		//Purpose: To determine if shape is a Triangle
		public boolean isTriangle() {
		return false;}
		
		//Purpose: To determine if shape is a Circle
		public boolean isCircle() {
		return false;	}
		
		public <X> X visit(IshapeVisotor<X> V) {
			return (V.Ellipse(this.alen,this.blen));
		}

		@Override
		public boolean isEllipse() {
			// TODO Auto-generated method stub
			return true;
		}
		
		public double TOSTRING() {
			return alen;
		}
}
