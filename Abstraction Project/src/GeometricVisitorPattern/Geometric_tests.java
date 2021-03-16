package GeometricVisitorPattern;
//Tests
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
//JUnit Test File
class Geometric_tests {

	@Test
	void Quadilaterals() {
		Square A = new Square(4);
		Rectangle B = new Rectangle(4,5);
		Rhombus C = new Rhombus(20,10);
		
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
	}
		
	@Test
	void Triangles() {
		EquilateralTriangle A = new EquilateralTriangle(4,5);
		IsoscelesTriangle B = new IsoscelesTriangle(7,3,6);
		ScaleneTriangle C = new ScaleneTriangle(5,6,3,3);
		
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
	}
	
	@Test
	void Circle() {
		Circle A = new Circle(4);
		
		assertEquals(A.area(),50.3, 0.1);
		assertEquals(A.perimeter(), 25.1, 0.1);
		
		assertEquals(A.isQuadrilateral(), false);
		
		assertEquals(A.isTriangle(), false);
				
		assertEquals(A.isCircle(), true);
			
		assertEquals(A.sides(), 1);
		
	}
	
	@Test
	void Visitor() {
		IshapeVisotor<Double> Z= new ShapeAreaVisitor();
		
		Square A = new Square(4);
		Rectangle B = new Rectangle(4,5);
		Rhombus C = new Rhombus(20,10);
		EquilateralTriangle E = new EquilateralTriangle(4,5);
		IsoscelesTriangle F = new IsoscelesTriangle(7,3,6);
		ScaleneTriangle G = new ScaleneTriangle(5,6,3,3);
		Circle H = new Circle(4);
		Ellipse I = new Ellipse(4,5);
		compose J = new compose(A, H);
		
		assertEquals(A.visit(Z), 16);
		assertEquals(B.visit(Z), 20);
		assertEquals(C.visit(Z), 200);
		assertEquals(E.visit(Z), 10);
		assertEquals(F.visit(Z), 9);
		assertEquals(G.visit(Z), 9);
		assertEquals(H.visit(Z), 50.24);
		assertEquals(I.visit(Z), 15.7, .1);
		assertEquals(J.visit(Z), 66.3, .1);
		
		IshapeVisotor<IGeometry> Y = new ShapeDoubDimVisitor();
		
		Quadilateral A1 = new Square(8);
		Quadilateral B1 = new Rectangle(8,10);
		Quadilateral C1 = new Rhombus(40,20);
		EquilateralTriangle E1 = new EquilateralTriangle(8,10);
		IsoscelesTriangle F1 = new IsoscelesTriangle(14,6,12);
		ScaleneTriangle G1 = new ScaleneTriangle(10,12,6,6);
		Circle H1 = new Circle(8);
		Ellipse I1 = new Ellipse(8,10);
		compose J1 = new compose(A1, H1);
		
		assertEquals(A.visit(Y).TOSTRING(), A1.TOSTRING());
		assertEquals(B.visit(Y).TOSTRING(), B1.TOSTRING());
		assertEquals(C.visit(Y).TOSTRING(), C1.TOSTRING());
		assertEquals(E.visit(Y).TOSTRING(), E1.TOSTRING());
		assertEquals(F.visit(Y).TOSTRING(), F1.TOSTRING());
		assertEquals(G.visit(Y).TOSTRING(), G1.TOSTRING());
		assertEquals(H.visit(Y).TOSTRING(), H1.TOSTRING());
		assertEquals(I.visit(Y).TOSTRING(), I1.TOSTRING());
		assertEquals(J.visit(Y).TOSTRING(), J1.TOSTRING());
		
		IshapeVisotor<IGeometry> X = new ShapeHalfDimVisitor();
		
		Square A3 = new Square(2);
		Rectangle B3 = new Rectangle(2,2.5);
		Rhombus C3 = new Rhombus(10,5);
		EquilateralTriangle E3 = new EquilateralTriangle(2,2.5);
		IsoscelesTriangle F3 = new IsoscelesTriangle(3.5,1.5,3);
		ScaleneTriangle G3 = new ScaleneTriangle(2.5,3,1.5,1.5);
		Circle H3 = new Circle(2);
		Ellipse I3 = new Ellipse(2,2.5);
		compose J3 = new compose(A3, H3);
		
		assertEquals(A.visit(X).TOSTRING(), A3.TOSTRING());
		assertEquals(B.visit(X).TOSTRING(), B3.TOSTRING());
		assertEquals(C.visit(X).TOSTRING(), C3.TOSTRING());
		assertEquals(E.visit(X).TOSTRING(), E3.TOSTRING());
		assertEquals(F.visit(X).TOSTRING(), F3.TOSTRING());
		assertEquals(G.visit(X).TOSTRING(), G3.TOSTRING());
		assertEquals(H.visit(X).TOSTRING(), H3.TOSTRING());
		assertEquals(I.visit(X).TOSTRING(), I3.TOSTRING());
		assertEquals(J.visit(X).TOSTRING(), J3.TOSTRING());
		
			}
	
}
