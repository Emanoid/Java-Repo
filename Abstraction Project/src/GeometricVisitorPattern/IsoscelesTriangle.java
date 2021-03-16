package GeometricVisitorPattern;

/**
 * Class for IsoscelesTriange
 * variable side => a
 * variable base => b
 * variable height => h
 */
public class IsoscelesTriangle extends Triangle{
	
	//Purpose: Implements an Isosceles Triangle
	public IsoscelesTriangle(double a, double b, double h) {
		super(a,b,a,h);	}
	}
