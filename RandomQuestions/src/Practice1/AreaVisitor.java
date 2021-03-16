package Practice1;

public class AreaVisitor implements IVisitor{

	@Override
	public double Circle(double r) {
		// TODO Auto-generated method stub
		return Math.PI*r*r;
	}

	@Override
	public double Quadilateral(double l, double w) {
		// TODO Auto-generated method stub
		return l*w;
	}

	@Override
	public double Triangle(double a, double b, double c) {
		// TODO Auto-generated method stub
		return .5*b*c;
	}

}
