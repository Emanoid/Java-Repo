package Mammal;

public class Hedgehog extends AYinotheria{
	 /**
     * The constructor for a Hedgehog
     * @param len the length of the hedgehog
     * @param w the weight of the hedgehog
     * @param c the color of the hedgehog
     */
    public Hedgehog(Double len, Integer w, String c) {
    	super(len,w,c,10);
          }

    /**
     * Returns the color of the hedgehog as a string
     */
    public String getColor() {
        return this.getOtherfield();
    }
}
