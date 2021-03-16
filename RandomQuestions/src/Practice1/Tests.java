package Practice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tests {

	@Test
	void Shapes(){
		IGeometry circle = new Circle(2);
		IGeometry triangle = new Triangle(2,3,4);
		IGeometry square = new Square(2,3);
		IGeometry rectangle = new Rectangle(3,4);
		
		assertEquals(circle.perimeter(), 12.5, .1);
		assertEquals(triangle.perimeter(), 9);
		assertEquals(square.perimeter(), 10);
		assertEquals(rectangle.perimeter(), 14);
		
		IVisitor area = new AreaVisitor();
		
		assertEquals(circle.visit(area), 12.5, .1);
		assertEquals(triangle.visit(area), 6);
		assertEquals(square.visit(area), 6);
		assertEquals(rectangle.visit(area), 12);
	}

}
