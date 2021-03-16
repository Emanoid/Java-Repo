package Olatunde_Emmanuel_Beeck_Derrek_Bland_Elijah_Navas_Edwin;

/**
 *Purpose: Interface for the Stack: Does not use List
 *
 * @param <X>
 */
public interface ISTACK<X> {
	//purpose: adds top to stack
	public ISTACK<X> push(X v);
	//purpose: gets top of Stack
	public X top() throws Exception;
	//purpose: removes the top from the stack
	public ISTACK<X> pop() throws Exception;
	//Purpose: to check if stack is empty
	public boolean emptyStack();
	//purpose: To reverse the stack
	public String ToString();
	//Purpose: To print out the elements in stack as a string
	public ISTACK<X> AddEnd(X v);
	//adds element from the top of the stack to the end of the list

	}
