package Practice1;

public abstract class Quadilateral implements IGeometry{
	
	protected double l, w;
	
	public Quadilateral(double ll, double ww) {
		l = ll; w = ww;
	}
	
	public double perimeter() {
		return 2*l+2*w;
	}
	
	@Override
	public double visit(IVisitor X) {
		// TODO Auto-generated method stub
		return X.Quadilateral(l, w);
	}
}
