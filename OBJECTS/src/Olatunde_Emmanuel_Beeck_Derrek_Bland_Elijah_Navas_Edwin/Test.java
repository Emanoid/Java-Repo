package Olatunde_Emmanuel_Beeck_Derrek_Bland_Elijah_Navas_Edwin;


import static org.junit.jupiter.api.Assertions.*;

//Test for Stack: with  List

public class Test {
	
	void ISTACK_LIST_TEST(){
		ISTACK<String> B = new StackMTLIST<String>();
		ISTACK<String> B1 = B.push("Hans").push("there ").push("Hello ");
		ISTACK<String> B3 = B.push("Hans").push("there ");
		try {
		assertEquals(B.emptyStack(), true);
		assertEquals(B1.emptyStack(), false);
		assertEquals(B1.pop().ToString().equals(B3.ToString()), true);
		assertEquals(B1.top().equals("Hello "), true);
		
				}
		catch(Exception e) {
			System.out.println("Error ListTests: "+ e.getMessage());
		}}

//Test for Stack: without List

void STACK_TEST(){
	ISTACK<String> A = new MTSTACK<String>();
	ISTACK<String> A1 = A.push("Hans").push("there ").push("Hello ");
	ISTACK<String> A3 = A.push("Hans").push("there ");
	try {
	assertEquals(A.emptyStack(), true);
	assertEquals(A1.emptyStack(), false);
	assertEquals(A1.pop().ToString().equals(A3.ToString()), true);
	assertEquals(A1.top().equals("Hello "), true);
			
	}
	catch(Exception e) {
		System.out.println("Error ListTests: "+ e.getMessage());
	}}

void Main() {
	ISTACK<Integer> C= new StackMTLIST<Integer>();
    ISTACK<Integer> C1 = C.push(new Integer (6)).push(new Integer(7)).push(new Integer(8));
    ISTACK<Integer> C2 = C.push(new Integer (8)).push(new Integer(7)).push(new Integer(6));
    ISTACK<Integer> C3 = C.push(new Integer (6)).push(new Integer(7)).push(new Integer(9)).push(new Integer(21)).push(new Integer(31));
    ISTACK<Integer> C4 = C.push(new Integer (31)).push(new Integer(21)).push(new Integer(9)).push(new Integer(7)).push(new Integer(6));
    ISTACK<Double> F = new StackMTLIST<Double>();
    ISTACK<Double> F1 = F.push(new Double (1.0)).push(new Double(2.0)).push(new Double(3.0));
    ISTACK<Double> F2 = F.push(new Double (3.0)).push(new Double(2.0)).push(new Double(1.0));
	ISTACK<String> E = new MTSTACK<String>();
	ISTACK<String> L0 = new StackMTLIST<String>();
	L0 = L0.push("pal!").push("there ").push("Hi ");
	try {
		assertEquals(Main.reverse(L0, E).ToString().equals(E.push("Hi ").push("there ").push("pal!").ToString()), true);
		assertEquals(Main.reverse(C3, new MTSTACK<Integer>()).equals(C4),true);
		assertEquals(Main.reverse(F1, new MTSTACK<Double>()).equals(F2), true);
		}
	catch(Exception e) {
		System.out.println("Error ListTests: "+ e.getMessage());
	}}
}
