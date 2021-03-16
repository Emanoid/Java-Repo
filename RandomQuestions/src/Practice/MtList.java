package Practice;

public class MtList<X> implements IList<X>{
	
	public MtList() {}

	public IList<X> cons(X v) {
		return (new NmtList<X>(v, this));
	}

	public int length() {
		return 0;
	}

	public boolean IsEmpty() {
		return true;
	}

	public X first() throws Exception {
		throw new Exception("An empty list does not have a first element");
		}

	@Override
	public IList<X> rest() throws Exception {
		throw new Exception("An empty list does not have a rest element");
	}

	@Override
	public String tos() {
		// TODO Auto-generated method stub
		return ("");	}

	@Override
	public X index(int v) throws Exception {
		throw new Exception("An empty list does not have an index");
	}

	@Override
	public IList<X> filter(IPred<X> p) {
		return new MtList<X>();
	}

	@Override
	public IList<X> map(IFun<X> p) {
		return new MtList<X>();
	}

	@Override
	public <Y> Y foldl(IFun2<X, Y> p, Y res) {
		return res;
	}



}
