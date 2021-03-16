package Posn3D;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Posn3d_test {

	@Test
	public void Posn3dtests() {
		Posn3d P1 = new Posn3d(10,10,10);
		Posn3d P2 = new Posn3d(5,8,87);
			//assertEquals(P1.x,10);
		assertEquals(P1.getx(),10);
		assertEquals(P2.gety(),8);
		assertEquals(P2.getz(),87);
		assertEquals(P1.move(10, 10, 10).equal(new Posn3d(20,20,20)), true);
		P2.mmove(2, 3, 4);
		assertEquals(P2.equal(new Posn3d(7,11,91)), true);
	}

}
