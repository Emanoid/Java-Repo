package Mammal;

public class platpus extends AYinotheria{
	
	/**
     * The constructor for a Platypus
     * @param len the length if the platypus
     * @param w the weight of the platypus
     * @param c the sex of the platypus
     */
	public platpus(Double len, Integer w, String s) {
			super(len,w,s,0);
		}
	
	public String getSex() {
		return this.getOtherfield();}

}

