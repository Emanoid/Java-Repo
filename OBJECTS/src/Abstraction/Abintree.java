package Abstraction;

public abstract class Abintree<X> implements bintree<X> {
	protected X val;
	protected Abintree(X v) {
		val = v;
	}
		public X getRootval() {return val;}
}
