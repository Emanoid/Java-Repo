package Practice;

public interface IList<X> {
	
	public IList<X> cons(X v);
	public int length();
	public boolean IsEmpty();
	public X first() throws Exception;
	public IList<X> rest() throws Exception;
	public String tos();
	public X index(int v) throws Exception;
	public IList<X> filter(IPred<X> p);
	public IList<X> map(IFun<X> p);
	public <Y> Y foldl(IFun2<X,Y> p, Y res);	

}
