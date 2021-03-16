package Olatunde_Emmanuel_Beeck_Derrek_Bland_Elijah_Navas_Edwin;
 /**
  * Purpose: Class for Stack: with list
  *
  * @param <X>
  */
public class StackNMTLIST<X> implements ISTACK<X>, StackIList<X>{
	
	//first of the stack
	private X car;
	// rest of the stack
	private ISTACK<X> cdr;
	
	//Purpose:Implements Non Empty Stack
	public StackNMTLIST(X f, ISTACK<X> r) {
		//first of the stack
		car = f;
		//rest of the stack
		cdr = r;	}
	
	//Purpose: To add an element to the top of the stack
	public ISTACK<X> cons(X v){
		return new StackNMTLIST<X>(v,this);	}
		//returns stack with v at the top and this as rest
	
	//Purpose: To determine f stack is empty
	public boolean isEmpty() {
		return false;}
		//returns false since stack is not empty
	
	//Purpose: To determine if this stack is equal this stack l
	public boolean equals(StackIList<X> l) {
		try {
			return((this.first().equals(l.first())) && this.rest().equals(l.rest()));}
			//returns true if the values of first and rest of both stacks are equal
		catch(Exception e) {
			System.out.println("Error StackNMTLIST equals: "+e.getMessage());
			//Exception: Returns error if an empty stack is reached
			return false;}
		}	//returns false if the values of first and rest of both stacks are not equal
	
	//Purpose: To return top of stack
	public X first() throws Exception{
		return car;}
		//Exception: returns error if stack is empty
	
	//Purpose: To return rest of stack
	public ISTACK<X> rest() throws Exception {
		return cdr;}
		//Exception: returns exception if stack is empty
	
		
	//Purpose: To push an item onto the top of the stack
	public ISTACK<X> push(X v) {
		return this.cons(v);
		//implements cons of v to this stack
	}

	//Purpose: To obtain top of stack
	public X top() throws Exception {
		return this.first();
		//implements first to this stack
	}

	//Purpose: To obtain the rest of the stack
	public ISTACK<X> pop() throws Exception {
		return this.rest();
		//implements remove to remove the first element in the stack
	}

	//Purpose: To return all elements in the stack as strings 
	public String ToString() {
		return ""+this.car+""+this.cdr.ToString();}
		//prints out elements in the stack
	
	//Purpose: To add an element to the end of the stack
	public ISTACK<X> AddEnd(X ele) {
        return new StackNMTLIST<X>(car, cdr.AddEnd(ele));
        //returns stack with ele at the end of stack
    }

	//Purpose: To determine f stack is empty
	public boolean emptyStack() {
		return this.isEmpty();
	}
	
	
	
}
