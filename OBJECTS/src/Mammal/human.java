package Mammal;

public class human extends ATherifomes {
	private Double height;
	/**
     * The constructor for a human. A human always has 2 mamory glands
     * @param h the height of the human
     * @param w the weight of the human
     * @param s the sex of the human
     */
	public human(Double h, String s, Integer w) {
		 super(w,s,2);
		this.height = h;
			}
	
	public Double getHeight() {
		return this.height;	}
	
	public String getSex()
	{return this.getOtherfield();}
}
