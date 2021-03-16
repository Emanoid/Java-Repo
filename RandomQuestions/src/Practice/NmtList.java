package Practice;

public class NmtList<X> implements IList<X>{
	private X a;
	private IList<X> b;
	
	public NmtList(X blu, IList<X> pac) {
		a = blu; b = pac;
	}

	public IList<X> cons(X v) {
		return (new NmtList(v, this));
	}

	public int length() {
		return (1+this.b.length());
	}

	public boolean IsEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public X first() throws Exception {
		// TODO Auto-generated method stub
		return this.a;
	}

	@Override
	public IList<X> rest() throws Exception {
		return this.b;
	}

	@Override
	public String tos() {
		// TODO Auto-generated method stub
		return (""+this.a+""+this.b.tos()+"");
	}

	@Override
	public X index(int v) throws Exception {
		if(v==0) {return this.a;}
		else {return (this.b.index(v-1));}
	}

	@Override
	public IList<X> filter(IPred<X> p) {
		try {
			if(p.p(this.first())) {
				return (new NmtList<X> (this.first(), this.rest().filter(p)));}
			else {return (this.rest().filter(p));	}}
		catch(Exception e) {System.out.println("NmtList Filter: "+e.getMessage());
		return new MtList<X>();}
		}

	@Override
	public IList<X> map(IFun<X> p) {
		try {
		return (new NmtList<X>(p.f(this.first()), this.rest().map(p)));}
		catch(Exception e) {System.out.println("NmtList<X> map: "+e.getMessage());
		return this;}
	}

	@Override
	public <Y> Y foldl(IFun2<X, Y> p, Y res) {
		try {
			return (this.rest().foldl(p, p.p(this.first(), res)));
		}
		catch(Exception e) {System.out.println("NmtList<X> foldl");
		return res;}
	}

}
