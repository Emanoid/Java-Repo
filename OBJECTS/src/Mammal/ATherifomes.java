package Mammal;

public abstract class ATherifomes extends Amammal {
	protected String other; //color or sex
	
	public ATherifomes(Integer w, String c, Integer n)
	//abstract constructor for all mammals
	{
		this.weight = w;
		this.other = c;
		this.numglands = n;
	}
	
	public Boolean isYinotheria() {return false;}
	public Boolean isTheriifomes() {return true;}
	public String getOtherfield() {return this.other;}
}
