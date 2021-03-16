package GeometricVisitorPattern;

public abstract class aShape implements IGeometry {
	
	//Purpose: To implement aShape
	public aShape(int s) {
		side = s;		}
	
	//Observers
	protected int side;
	
			//Method
	//Purpose: To determine the side of the Circle
	public int sides() {
		return side;	}
	
	


	
}
