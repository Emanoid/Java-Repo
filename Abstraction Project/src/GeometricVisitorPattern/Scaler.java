package GeometricVisitorPattern;

public abstract class Scaler implements IshapeVisotor<IGeometry>{
	
	

	public IGeometry Ellipse(double a, double b) {
		Ellipse A = new Ellipse(a,b);
		if(this.ishalf()) {return new Ellipse(a/2,b/2);}
		else{ return (new Ellipse(a*2,b*2));}
	}

	@Override 
	public IGeometry Circle(double r) {
		if(this.ishalf()) {return new Circle(r/2);}
		else{return (new Circle(r*2));}
	}

	@Override
	public IGeometry Quadilateral(double l, double w) {
		if(this.ishalf()) {return new Quadilateral(l/2, w/2);}
		else{return (new Quadilateral(l*2, w*2));}
	}


	public IGeometry Triangle(double a, double b, double c, double d) {
		if(this.ishalf()) {return new Triangle(a/2,b/2,c/2,d/2);}
		else{return (new Triangle(a*2,b*2,c*2,d*2));}
	}

	@Override
	public IGeometry compose(IGeometry a, IGeometry b) {
		IshapeVisotor Y = new ShapeHalfDimVisitor();
		IshapeVisotor Z = new ShapeDoubDimVisitor();
		if(this.ishalf()) {
			return (new compose(a, b) );
		}
		else{
			return (new compose(a,b));}
		}

}
