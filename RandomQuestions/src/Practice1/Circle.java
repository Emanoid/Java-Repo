package Practice1;

public class Circle implements IGeometry {
	protected double r;
	
	public Circle(double rr) {
		r = rr;
	}
	
	public double perimeter() {
		return Math.PI*(2*r);
	}

	@Override
	public double visit(IVisitor X) {
		// TODO Auto-generated method stub
		return X.Circle(this.r);
	}

}
