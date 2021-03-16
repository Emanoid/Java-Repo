package Practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tester {

	@Test
	void GenericPair() {
		GenericPair<String,Integer> A = new GenericPair<String,Integer>("Gabe",7);
		GenericPair<String,Integer> b = new GenericPair<String,Integer>("Hans",3);
		
		assertEquals(A.GetX(), "Gabe");
		assertEquals(A.GetY(), 7);

		A.SetX("Mose");
		A.SetY(10);
		
		assertEquals(A.equals(b), false);
		assertEquals(A.printout(), "Pair: X: "+"Mose"+" Y: "+10+"");
	}

	@Test
	void Lists() {
		MtList<String> A = new MtList<String>();
		IList<String> B = A.cons("Gabe").cons("Mose").cons("Hans");
		IList<String> C = A.cons("Gabe").cons("Mose");
		MtList<Integer> K = new MtList<Integer>();
		IList<Integer> L = K.cons(4).cons(6).cons(8).cons(11); 
		IList<Integer> G = K.cons(8).cons(12).cons(16).cons(22);
		IList<Integer> G1 = K.cons(11).cons(8).cons(6).cons(4);
		IList<Integer> L1 = K.cons(4).cons(6).cons(8);
		try {
		assertEquals(B.length(), 3);
		assertEquals(A.length(), 0);
		assertEquals(B.IsEmpty(), false);
		assertEquals(A.IsEmpty(), true);
		assertEquals(B.first(), "Hans");
		assertEquals(B.rest().tos().equals(C.tos()), true);
		assertEquals(B.index(1), "Mose");
		assertEquals(L.filter(n -> n%2==0).tos(), L1.tos());
		assertEquals((L.map(n -> n*2)).tos(), G.tos());
		assertEquals(L.foldl((n,r) -> r, L).tos(), G1.tos());
		
		}
		catch(Exception e) {System.out.println("Error at"+e.getMessage());}
		
	}
	
}
