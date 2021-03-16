package Olatunde_Emmanuel_Beeck_Derrek_Bland_Elijah_Navas_Edwin;

public class Main {
	/** 
     * reverse: Reverses a given list using the given stack
     * @param aList The list that you want to reverse
     * @param stack The stack that you will use
     * @return aList that is reversed
     */
    public static ISTACK reverse(ISTACK list, ISTACK stack) {
        // While the list is not empty recurse
        while(!list.emptyStack()) {
        	 try {
	        	//Invariant: [0.. n-1) in the stack A is in reverse order (n-1) is the unprocessed part of list
	            
	            stack = stack.push(list.top());
	          //Invariant: [0...n) is reversed in stack
	             // push the first element of the list onto the stack
	              
	            list = list.pop();
	          //Invariant: [n....i) is unprocessed
	            // set the list to the rest of the elements
	
	            //Termination Argument: The loop will terminate because the stack will eventually become empty because
	            // the first eleement of the list is pushed every loop. Since the top car of the stack is pushed after every loop
	            // the stack will become empty making the while false terminating the loop.
            } catch(Exception e) {
            	System.out.println("Error Main reverse: "+ e.getMessage());
            }
            }

        // While the stack is not empty pop elements off
        while(!stack.emptyStack()) {
            try {
                //Invariant:[0.. n-1) in the stack is in reverse order (n-1 is the unprocessed part of list

                // Place the element at the top of the stack to the back of the list
                
                // Place the element at the top of the stack to the back of the list
                list = list.AddEnd(stack.top());
              //Invariant: [0...n) is reversed in stack
                // set the stack equal to the rest of the stack
                stack = stack.pop();
                // Invariant: [n....i) is unprocessed
            } catch (Exception e) {
	            	System.out.println("Error Main reverse: "+ e.getMessage());
	            	// handle the error
            }
            //Termination Argument: The loop will terminate because the stack will eventually become empty because
            // the first element of the list is pushed every loop. Since the top car of the stack is pushed after every loop
            // the stack will become empty making the while false terminating the loop.
        }
        // return the reversed list
        return list;
    }
 

    public static void main(String[] args) {
        ISTACK list = new StackMTLIST<Integer>().push(4).push(5).push(6).push(7).push(7);
        System.out.println(list.ToString());


        ISTACK reversestack = reverse(list, new MTSTACK<Integer>());
        System.out.println(reversestack.ToString());
        
        

    }

}
