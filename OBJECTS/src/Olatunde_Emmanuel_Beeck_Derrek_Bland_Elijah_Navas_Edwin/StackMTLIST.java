package Olatunde_Emmanuel_Beeck_Derrek_Bland_Elijah_Navas_Edwin;

/**
 * Purpose: Class for empty Stack : with list
 *
 * @param <X>
 */

public class StackMTLIST<X> implements StackIList<X>, ISTACK<X>{
	
	//Purpose: initializes an emtpy stack
	public StackMTLIST() {}
	
	//Purpose: To add an element to a stack
	public ISTACK<X> cons(X v){
		//returns stack with v at the top of stack
		return(new StackNMTLIST<X>(v,this));}
	
	//Purpose: to determine if stack is empty
	public boolean isEmpty() {
		return true;}
	
	//Purpose: To determine if this stack is equal to stack l
	public boolean equals(StackIList<X> l) {
		//returns true if l is empty because that is only when it will equal this stack
		return l.isEmpty();}
	
	//Purpose: To determine the item at the top of the stack
	public X first() throws Exception{
		//Exception: throws exception because this stack is empty
		throw new Exception("Method first applied to an empty stack");}
	
	//Purpose: To return the rest of the stack after the top item has been removed
	public ISTACK<X> rest() throws Exception{
		//Exception: because this stack is empty
		throw new Exception("Method rest applied to an empty stack");}
	
	//Purpose: To obtain the rest of the stack
	public ISTACK<X> pop() throws Exception {
		throw new Exception("Method pop applied to an empty list");}
		//Exception: this stack is empty
	
	//Purpose: To push an item onto the top of the stack
	public ISTACK<X> push(X v) {
		return this.cons(v);	}
		//returns new Non Empty stack with item v
	
	//Purpose: To obtain top of stack
	public X top() throws Exception {
		throw new Exception("Method top applied to an empty list");}
		//Exception: this stack is empty, does not have an element

	//Purpose: To return all elements in the stack as strings 
	public String ToString() {
		return "";
		}//stack is empty

	//Purpose: To add an element to the end of the stack
	public ISTACK<X> AddEnd(X v) {
		return new StackMTLIST<X>().push(v);
	}   //returns stack with v at the end of stack

	//Purpose: to determine if stack is empty
	public boolean emptyStack() {
		return true;
	}



	

}
