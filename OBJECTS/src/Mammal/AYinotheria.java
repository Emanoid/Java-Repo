package Mammal;

public abstract class AYinotheria extends Amammal{
	protected Double length;
	protected String other;
	public AYinotheria(Double l, Integer w, String s, Integer n) {
		this.length = l;
		this.weight = w;
		this.other = s;
		this.numglands = n;
	}
	public Double getLength() {return this.length;}
	public String getOtherfield(){return this.other;}
	public Boolean isYinotheria() {return true;}
	public Boolean isTheriifomes() {return false;}
	
	
}
