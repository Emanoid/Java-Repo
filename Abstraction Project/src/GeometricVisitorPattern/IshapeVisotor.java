package GeometricVisitorPattern;

public interface IshapeVisotor<X> {
	public X Ellipse(double a, double b);
	
	public X Circle(double r);
	
	public X Quadilateral(double l, double w);
	
	public X Triangle(double a, double b, double c, double d);
	
	public X compose(X a, X b);
	
	public boolean ishalf();
}
