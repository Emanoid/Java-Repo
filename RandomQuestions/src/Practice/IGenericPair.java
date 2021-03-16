package Practice;

public interface IGenericPair<X, Y> {
	public X GetX();
	public Y GetY();
	public void SetX(X v);
	public void SetY(Y v);
	public boolean equals(GenericPair<X,Y> p);
	public String printout();
		
}
