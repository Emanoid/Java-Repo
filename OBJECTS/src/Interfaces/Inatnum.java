package Interfaces;

/*Emmanuel Olatunde
Derrek Beeck
Elijah Bland
Edwin Navas
*/
public interface Inatnum {
	public int getVal();//hello again
	//Purpose: To return the int value of this inatnum
	public boolean isZero();
	//Purpose: To return true if this Inatnum is 0 and false otherwise

	public boolean equal(Inatnum B);
	//Purpose: To determine if this Inatnum and the given natnum have the same val

	public Inatnum succ();
	//Purpose: To return the successor of this Inatnum

	public Inatnum pred() throws Exception;
	//Purpose: To return the predecessor of this Inatnum

	public Inatnum add(Inatnum a);
	//Purpose: To add this Inatnum with the given Inatnum

	public boolean lessthan(Inatnum a) throws Exception;
	//Purpose: To determine if this Inatnum is less than the given Inatnum

	public boolean greaterthan(Inatnum a) throws Exception;
	//Purpose: To determine if this Inatnum is greater than the given Inatnum

	public boolean leq(Inatnum a) throws Exception;
	//Purpose: To determine if this Inatnum is less than or equal to given Inatnum

	public boolean geq(Inatnum a) throws Exception;
	//Purpose: To determine if this Inatnum is greater than or equal to given Inatnum

	public Inatnum subtract(Inatnum a) throws Exception;
	//Purpose: To subtract this Inatnum with a given Inatnum

	public Inatnum multiply(Inatnum a) throws Exception;
	//Purpose: To multiply this Inatnum with a given Inatnum

	public Inatnum quotient(Inatnum a) throws Exception;
	//Purpose: To divide this Inatnum with a given Inatnum

	public Inatnum remainder(Inatnum a) throws Exception;
	//Purpose: To determine the remainder of the quotient of this Inatnum with a given Inatnum

	public String ToString();
	//Purpose: To return a String of this Inatnum

	public Inatnum print();
	//Purpose: To print out this Inatnum
	// test


}