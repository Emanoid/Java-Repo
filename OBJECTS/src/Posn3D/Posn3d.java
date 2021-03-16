package Posn3D;

public class Posn3d {
	private int x, y,z; //Purpose: The coordinates of the 3D posn
	public Posn3d(int a, int b, int c) {
		x=a;y=b;z=c;}
	//selectors
		public int getx() {return x;}
		public int gety() {return y;}
		public int getz() {return z;}
	//mutators
		public Posn3d move(int dx, int dy, int dz) {
			return(new Posn3d(x+dx, y+dy, z+dz));
		}
		
		public void mmove(int dx, int dy, int dz) {
			//Purpose:To move this posn by adding the given amounts
			//Effect: x is chagned by dx. y is changed by dy, and z
			//is changed by dz
			x = x +dx; y= y + dy; z = z + dz;
		}
		
		public boolean equal(Posn3d other) {
			return(x==other.getx()&& y==other.gety() && z==other.getz());
		}
		
		
}
