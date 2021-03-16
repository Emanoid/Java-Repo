package Interfaces;

public class nonzeronatnum implements Inatnum{
 private int n; //the value of this natnum
 private Inatnum prev; //the natnum used to construct this natnum
 
 public nonzeronatnum(Inatnum natnum) {
  n = natnum.getVal() + 1;
  prev=natnum;
 }
 
 public int getVal() {return n;}//used to get the Value of natnum.
 
 public boolean isZero() {return false;}//in nonZero class so values in this class can never be zero.
 public boolean equal(Inatnum B) {return(this.n==B.getVal());}//returns a boolean and is used to check if values are equal.
 public Inatnum succ() {return(new nonzeronatnum(this));}//initialize successor
 public Inatnum pred() throws Exception {return prev;}//initialize predecessor.
 
 public Inatnum add(Inatnum a) 
 //purpose: to add two natnums together.
 {
  try {return(this.pred().add(a).succ());}//subtracts one from this and adds one to a with the successor.
  catch(Exception e) {System.out.println("Error add: "+ e.getMessage());//returns the error message if caught.
  return null;}//need a try and catch because (Exception) because 
  //we use the pred and successor.
   }
 //purpose: function is used to check if natnum (this) is less than natnum (a).
 public boolean lessthan(Inatnum a) throws Exception{
  if((this.isZero() &&a.isZero())==true) {return false;}//if both this and a are both zero, it returns false because it is not less than.
  if((this.isZero())==false&&a.isZero()==true) {return false;}//conditional that check if a is less than this.
  if((this.isZero())==true&&a.isZero()==false) {return true;}//conditional that checks if this is less than a.
  else {return this.pred().lessthan(a.pred()); }}//recursive call to subtract one from this and a.
  
 //purpose: function is used to check if natnum (this) is greater than natnum (a).
 public boolean greaterthan(Inatnum a) throws Exception{
  if((this.isZero() &&a.isZero())==true) {return false;}//if both this and a are both zero, it returns false because it is not greater than. 
  if((this.isZero())==false&&a.isZero()==true) {return true;}//conditional returns if a is greater than this.
  if((this.isZero())==true&&a.isZero()==false) {return false;}//conditional returns if this is greater than a.
  else {return this.pred().greaterthan(a.pred()); }//recursive call to subtract one from this and a.
 }

		
	public boolean geq(Inatnum a) throws Exception {//purpose: to find if an inatnum is greater than or equal to another inatnum
		if((this.isZero() &&a.isZero())==true) {return true;}//if our first value is zero and our a value is zero then return true
		if((this.isZero())==false&&a.isZero()==true) {return true;}// if our first value isnt zero and our a value is then return true
		if((this.isZero())==true&&a.isZero()==false) {return false;}//if our first value is zero and our a value is not then return false
		else {return this.pred().geq(a.pred());	}}//otherwise keep returning the previous value of this and a until the lower one hits zero and then it will look at one of the
							  // the previous conditions and eventually it will meet one of the conditions
	
	public boolean leq(Inatnum a) throws Exception {//purpose: to find if an innatum is less than our equal to another inatnum
		if((this.isZero() &&a.isZero())==true) {return true;}//if our this value is zero and our a value is zero then return true
		if((this.isZero())==false&&a.isZero()==true) {return false;}// if our this value isnt zero and our a value is then return false
		if((this.isZero())==true&&a.isZero()==false) {return true;}// if our this value is zero and our a value isnt then return true
		else {return this.pred().leq(a.pred());	}}// otherwise keep decrememtning this and a until one of them is zero and a condition can be met
	
	public Inatnum subtract(Inatnum a){//purpose: to subtract 2 values
		try {return(this.pred().subtract(a).pred());}//take the previous value of this and the previous value of a until one of them hits zero and then return the other value
		catch(Exception e) {System.out.println("Error add: "+ e.getMessage());// otherwise return an error, this needs to be greater than or equal to a otherise we'd get a negative
				    							// and there are no negative natural numbers
		return null;}
			}
		
	    public Inatnum multiply(Inatnum a) {//purpose: to multiply two natural numbers
               Inatnum zero = new zeronatnum(); // we need a new zero natural number for our res
                Inatnum res = zero;// this is our res value where we store our information, it needs to start at 0
                  //INV: i>0 && i-1 <= this.getval() && res = a^(i) ==> i=this.getval()-(this.getval()z-1)
                for(int i = this.getVal(); i>0;i--) {// setting our i value to our this and if its greater than zero decrement by 1
                    //INV: i>0 && i <= this.getval() && res = a^i ==> i=this.getval()-(this.getval()
			res = res.add(a);//now we save our res value as the previous res value plus a. we do this as many times as we are multiplying by. So if it is 3 times
                               //INV: i>0 && i <= this.getval() && res = a^i ==> i=this.getval()-(this.getval()-1) 
           			//i--  => i = this.getval()-(this.getval()-1-1)
           			 //INV: i>0 && i-1 <= this.getval() && res = a^(i) ==> i=this.getval()-(this.getval()-1-1)
          			 //INV: i>0 && i-1 <= this.getval() && res = a^(i) ==> i=this.getval()-(this.getval()z-1)     
			 // 4 then we are adding 4 3 times
                                                          }
			 //INV: i<0 && i-1 < this.getval() ==> i ==0 && res = a^i ==> i=this.getval()
            //Termination Argument: i starts at this.getval(), i decrements each time through the loop
						     return res;// we need to return our res value that holds our current value.
                                                          }//termination argument: the i value which is our this value decrements by one every time it goes through the loop so it must eventually = 0
                                                          // and once it hits zero it stops and returns our res value
              
              public Inatnum quotient(Inatnum a) throws Exception{//purpose: to find the quotient of 2 natural numbers
                             int N =n;// we need to initialize our n value which we are looping
                             if(a.isZero()==true) {return a;}// if our a value is zero then we just return a because 0 divided by any number is 0
                             Inatnum res = new zeronatnum();           // we need to set our res to zero to initialize it
   //INV: N>=a.getVal() && res = res + 1, where (res && 1) => Inatnum && N = N - a.getVal() 
                             while(N>=a.getVal()) {
				      //INV: N=a.getVal() && res = 0, where 0=> Inatnum && N = this.getVal()
                                           N=N-a.getVal(); // Initiates N as n subtracted from a.getVal() 
				       //INV: N>=a.getVal() && res = 0, where 0=> Inatnum && N = N - a.getVal()
                                           res = res.succ(); // initiates res as the succ of res
				      //INV: N>=a.getVal() && res = res + 1, where (res && 1) => Inatnum && N = N - a.getVal()
                                           }return res;
		      ////N<a.getVal() 
		      //Termination Argument: N starts at this.getVal(), n decrements each time through the loop, eventually 
        // N < a.getVal() and loop terminates
	      }

              // Purpose: To provide the remainder of two natural numbers
              
              public Inatnum remainder(Inatnum a) throws Exception{
                             int N = n;// to initalize our n value
                             Inatnum res = new zeronatnum();  //setting our res to 0
		      int remainder=0;//// setting our remainder to 0
		      
		      //INV: N>=a.getVal() && remainder = N =>N= N- a.getVal() && Inatnum && N = N - a.getVal()
                             while(N>=a.getVal()) {// our while loop that determines if our N is less than our value
				      //INV: N=a.getVal() && res = 0, where 0=> Inatnum && N = this.getVal()
                                           N=N-a.getVal();// we need to subtract our a.getVal from our N every loop
				     //INV: N>=a.getVal() && res = res + 1, where (res && 1) => Inatnum && N = N - a.getVal()
                                           remainder = N;// we set our remainder to our new N
				     //INV: N>=a.getVal() && remainder = N =>N= N- a.getVal() && Inatnum && N = N - a.getVal()
                                           }
		      //Termination Argument: N starts at this.getVal(), n decrements each time through the loop, eventually 
        // N < a.getVal() and loop terminates
		      int r=remainder;for(int i=1;i<=r;i++) {res=res.succ();} return res;// our for loop where our res is now equal to the successor of res
		      
                             }
              //Purpose: To return the input natural numbers output into a String
              //Example: "Natural Number: 4 and predecessor: 3"
              public String ToString(){
                             return "Natural Number: "+this.n+" and Predecessor: "+this.prev.getVal();}

              //Purpose: To print out this(int n)
//Example : input int=4 output-> returns 4
              public Inatnum print() {
                             return this;}

              //Purpose: To compute the factorial of a nonzero natural number
//Termination argument: (for loops)  The loop will terminate because I is decremented after every loop. Since the I decrements each time of the loop and is a non zero 
// natural number the loop will terminate
//Termination argument: (while loop 1st) The while loop will end because the value of dis.getVal() will compute its pred after each loop. 
	//Therefore making the loop while loop false and ending the loop. 
//Termination argument: (while loops 2nd) The while loop can terminate because the value of newone.getVal() succ is computed after each loop 
	//and since newone.getVal is less than res1.getVal they will eventually equal each other making the while loop false and ending the loop
              public static Inatnum factorial(int n) throws Exception{
                             Inatnum res = new zeronatnum().succ(); // we need to initialize res which is set as a nonzero natural number
                             Inatnum dis = new zeronatnum(); for(int i=n;i>=1;i--) {dis=dis.succ();} // dis is initialized as a new  non zero natural number and 
                             Inatnum res1 = res; Inatnum dis1 = dis; //new versions of res and dis are initiated
                             while(dis1.getVal()>0) { 
                             res1 = res1.multiply(dis1); dis1=dis1.pred();
                             }Inatnum newone = new zeronatnum(); 
                             while(newone.getVal()!= res1.getVal()) {
                                           newone = newone.succ(); // initiated newone which is the successor of newone
                                           }return newone; // returns newone once the loop ends
              }
}

