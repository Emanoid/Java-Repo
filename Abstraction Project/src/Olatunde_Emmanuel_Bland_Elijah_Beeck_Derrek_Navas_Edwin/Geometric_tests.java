package Olatunde_Emmanuel_Bland_Elijah_Beeck_Derrek_Navas_Edwin;
//Tests
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
//JUnit Test File
class Geometric_tests {
	
	
	@Test
	void Quadilaterals() {
		try {
		Square A = new Square(4);
		Rectangle B = new Rectangle(4,5);
		Rhombus C = new Rhombus(20,10);
		
		//Test for Triangle with zero input
		//Rectangle D = new Rectangle(4,0);
				
		assertEquals(A.area(), 16);
		assertEquals(B.area(), 20);
		assertEquals(C.area(), 200);
				
		assertEquals(A.perimeter(), 16);
		assertEquals(B.perimeter(), 18);
		assertEquals(C.perimeter(), 60);
	
		assertEquals(A.isQuadrilateral(), true);
		assertEquals(B.isQuadrilateral(), true);
		assertEquals(B.isQuadrilateral(), true);
		
		assertEquals(A.isTriangle(), false);
		assertEquals(B.isTriangle(), false);
		assertEquals(C.isTriangle(), false);
		
		assertEquals(A.isCircle(), false);
		assertEquals(B.isCircle(), false);
		assertEquals(C.isCircle(), false);
		
		assertEquals(A.sides(), 4);
		assertEquals(B.sides(), 4);
		assertEquals(C.sides(), 4);
		
		assertEquals(A.sideCraig(), 4);
		assertEquals(B.sideCraig(), 4);
		assertEquals(C.sideCraig(), 20); 
		
		}
		
		catch(Exception e) {System.out.println("Quadilaterals: "+e.getMessage());}
	}
		
	@Test
	void Triangles() {
		
		try {
		EquilateralTriangle A = new EquilateralTriangle(4,5);
		IsoscelesTriangle B = new IsoscelesTriangle(7,3,6);
		ScaleneTriangle C = new ScaleneTriangle(5,6,3,3);
		
		//Test for Triangle with zero input
		//IsoscelesTriangle D = new IsoscelesTriangle(4,0,6);
		
		//Test for Triangle with invalid input
		//IsoscelesTriangle D = new IsoscelesTriangle(4,100,6);
		
		assertEquals(A.area(), 10);
		assertEquals(B.area(), 9);
		assertEquals(C.area(), 9);
		
		assertEquals(A.perimeter(), 12);
		assertEquals(B.perimeter(), 17);
		assertEquals(C.perimeter(), 14);	
		
		assertEquals(A.isQuadrilateral(), false);
		assertEquals(B.isQuadrilateral(), false);
		assertEquals(B.isQuadrilateral(), false);
		
		assertEquals(A.isTriangle(), true);
		assertEquals(B.isTriangle(), true);
		assertEquals(C.isTriangle(), true);
		
		assertEquals(A.isCircle(), false);
		assertEquals(B.isCircle(), false);
		assertEquals(C.isCircle(), false);
		
		assertEquals(A.sides(), 3);
		assertEquals(B.sides(), 3);
		assertEquals(C.sides(), 3);
		
		assertEquals(A.sideCraig(), 4);
		assertEquals(B.sideCraig(), 7);
		assertEquals(C.sideCraig(), 5);
		
		
				//Alternative Comments2
		// Test for invalid length case on Triangle
        Exception e2 = assertThrows(Exception.class, ()-> {
            Triangle t = new ScaleneTriangle(4,3,8,10);
        });
        
        // Test for zero input on Triangle
        Exception e3 = assertThrows(Exception.class, ()-> {
            Triangle t = new ScaleneTriangle(0,0,0,0);
        });
	}
		catch(Exception e) {System.out.println("Triangle: "+e.getMessage());}
	}
	
	@Test
	void Circle() {
		
		try {
		Circle A = new Circle(4);
		
		//Test for Circle with zero input
		//Circle B = new Circle(0);
				
		assertEquals(A.area(),50.3, 0.1);
		assertEquals(A.perimeter(), 25.1, 0.1);
		
		assertEquals(A.isQuadrilateral(), false);
		
		assertEquals(A.isTriangle(), false);
				
		assertEquals(A.isCircle(), true);
			
		assertEquals(A.sides(), 1);
		
		assertEquals(A.sideCraig(), 4);
				
	}
	
	catch(Exception e) {System.out.println("Circle: "+e.getMessage());}
	}

}
