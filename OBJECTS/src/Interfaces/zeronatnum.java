package Interfaces;

public class zeronatnum implements Inatnum {

	public zeronatnum() {};
	//Purpose: TO return zero 
	public int getVal() {return(0);}

	//Purpose: To return a boolean value true  (true in all cases)
	public boolean isZero() {return true;}

	//Purpose: To compare two values and return a boolean true or false
	//True when B.isZero is zero and False when B.isZero is not zero
	public boolean equal(Inatnum B) {return(B.isZero());}

	//Purpose: To return the successor to zero and returns the value this
	public Inatnum succ() {return(new nonzeronatnum(this));}

	// Purpose: To return an Exception because zero has no natural predecessors
	public Inatnum pred() throws Exception{
		throw new Exception("Zero has no predecessor!");}
	// Purpose: To add zero and a natural number and returns the natural number (a)
	public Inatnum add(Inatnum a) {return a;}

	//Purpose: To return a boolean that determines less than that returns false when compared to zero and true on all other cases
	public boolean lessthan(Inatnum a) {
		if(a.isZero()) {return false;}
		else {return true;}
	}
	// Purpose: To return false because no natural number is greater than zero
	public boolean greaterthan(Inatnum a) {return false;}

	//: Purpose: Will always return true because zero is always less than or equal to all natural numbers
	public boolean leq(Inatnum a) {
		return true;}

	// Purpose: To return false for all values that are not equal to 0. For all other cases returns true
	public boolean geq(Inatnum a) {
		if(a.isZero()) {return true;}else {return false;}}

	// Purpose: To throw an Exception because a natural number subtracted from zero returns a value that
	// is negative which is not a natural number
	public Inatnum subtract(Inatnum a) throws Exception{
		throw new Exception("Zero has no predecessor!");
	}
	//Purpose: Returns "this" because multiplication by zero always returns 0.
	public Inatnum multiply(Inatnum a) {return this;}

	//Purpose: Returns 0 in all cases because zero/ over any number is always zero.
	// Throws an exception when zero is divided by itself
	public Inatnum quotient(Inatnum a) throws Exception{return this;}

	//Purpose: To return 0 since the remainder of zero is always zero
	public Inatnum remainder(Inatnum a) {return this;}

	// Purpose: To return a string that returns the given Natural number into a String.
	//Example: "Natural Number: 0"
	public String ToString(){
		return "Natural Number: "+this.getVal()+"";	}

	// Purpose: To return the value of the given number zero
	public Inatnum print() {
		return this;}
	// Purpose: To return the factorial of zero which is the succ of zero which is one
	public static Inatnum factorial(){
		Inatnum zero = new zeronatnum();
		return zero.succ();
	}
}