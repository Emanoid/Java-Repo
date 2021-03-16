package Practice1;

public class Triangle implements IGeometry{
	
	protected double a,b,c;
	public Triangle(double aa, double bb, double cc) {
		a =aa; b = bb; c = cc;
	}
	
	public double perimeter() {
		return (a+b+c);
	}

	@Override
	public double visit(IVisitor X) {
		// TODO Auto-generated method stub
		return X.Triangle(a, b, c);
	}
}
