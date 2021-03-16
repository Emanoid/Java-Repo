package Olatunde_Emmanuel_Bland_Elijah_Beeck_Derrek_Navas_Edwin;

/**
 * Interface for all Geometric Shapes
 *IGeometry
 */
public interface IGeometry {
	//Purpose: To determine the area of a shape
	public abstract double area();

	//Purpose: To determine the perimeter of a shape
	public abstract double perimeter();
	
	//Purpose: To determine the number of sides in a shape
	public abstract int sides();
	
	//Purpose: To determine the length of the first side in a shape
	//Recommended by Craig
	public abstract double sideCraig();
	
	//Purpose: To determine if shape is a Qudilateral
	public abstract boolean isQuadrilateral();

	//Purpose: To determine if shape is a Triangle
	public abstract boolean isTriangle();

	//Purpose: To determine if shape is a Circle
	public abstract boolean isCircle();

}
