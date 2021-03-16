package Olatunde_Emmanuel_Beeck_Derrek_Bland_Elijah_Navas_Edwin;

public interface StackIList<X> {
	public ISTACK<X> cons(X val);
	//Purpose: add the given value to this stack
	public boolean isEmpty();
	//Purpose: Determine if this stack is empty
	public boolean equals(StackIList<X>l);
	//Purpose: To determine if the given stack is equal to this stack
	public X first() throws Exception;
	//Purpose: To return the first element of this stack
	public ISTACK<X> rest() throws Exception;
	//Purpose: To return the rest of this stack
	public String ToString();
	//returns all elements in the stack
	}
