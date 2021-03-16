package Olatunde_Emmanuel_Bland_Elijah_Beeck_Derrek_Navas_Edwin;

public abstract class aShape implements IGeometry {
	
	//Purpose: To implement aShape
	public aShape(int s, double sidelnt) {
		side = s;		
		sidelength = sidelnt;}
	
	//Observers
	protected int side;
	protected double sidelength;
	
			//Method
	//Purpose: To determine the number of sides in the Shape
	public int sides() {
		return side;	}
	
	//Purpose: To determine the length of the first side in a shape
	//Recommended by Craig
	public double sideCraig() {
		return sidelength;
	}
	
	//Purpose: To determine if any dimension of the shape is set to zero
	public boolean IsZeroInput() {
		if((this.area()*side)==0) {return true;}
		else {return false;}
	}
	
	

	
}
