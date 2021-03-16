package GeometricVisitorPattern;

public class ShapeAreaVisitor implements IshapeVisotor<Double> {
	
	private static Double PI = 3.14;
	
	public Double Quadilateral(double l, double w) {
		return l*w;
	}
	
	public Double Ellipse(double a, double b) {
		return PI * a/2 * b/2;
	}
	public Double Circle(double r) {
		return PI * r * r;
	}
	public Double compose(Double a, Double b) {
		return a+ b;
	}


	@Override
	public Double Triangle(double a, double b, double c, double d) {
		// TODO Auto-generated method stub
		return .5 * b * d;
	}

	@Override
	public boolean ishalf() {
		// TODO Auto-generated method stub
		return false;
	}
}
