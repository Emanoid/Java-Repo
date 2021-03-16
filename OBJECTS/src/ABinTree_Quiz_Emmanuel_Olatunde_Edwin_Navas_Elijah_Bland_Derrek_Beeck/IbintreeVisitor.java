package ABinTree_Quiz_Emmanuel_Olatunde_Edwin_Navas_Elijah_Bland_Derrek_Beeck;

public interface IbintreeVisitor<X,R> {

	//Purpose: To implement visitor class on a leafnode
	public R leafnode(X val);
	//Purpose: To implement visitor class on an Interiornode
	public R interiornode(X val, R l, R r);	
}
