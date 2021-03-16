package Mammal;

public class cowcat extends ATherifomes{
	/**
     * The constructor for a CatCow
     * @param w the weight
     * @param c the color
     * @param n the number of mammary glands
     */
	protected cowcat(Integer w, String c, Integer n) {
		super(w,c,n);
	}
	public String getColor() {
		return this.getOtherfield();}
}
