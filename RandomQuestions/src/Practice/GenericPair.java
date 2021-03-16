package Practice;

public class GenericPair<X, Y> implements IGenericPair<X,Y>{
	private X left;
	private Y right;
	public GenericPair(X x, Y y){
		this.left=x;this.right=y;
	}

public X GetX() {
	return left;
}

public Y GetY() {
	return right;
}
 public void SetX(X v) {
	this.left = v;
	}

public void SetY(Y v) {
	this.right = v;
}
public boolean equals(GenericPair<X,Y> p) {
	if(this.left==p.left && this.right==p.right) {return true;}
	else{return false;}
}

public String printout() {
	return ("Pair: X: "+this.GetX()+" Y: "+this.GetY()+"");
			}


}
