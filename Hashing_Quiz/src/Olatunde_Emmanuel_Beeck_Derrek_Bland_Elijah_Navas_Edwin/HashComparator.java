package Olatunde_Emmanuel_Beeck_Derrek_Bland_Elijah_Navas_Edwin;

public interface HashComparator<K> {
	//Purpose: To Index the Hash_Table and mask its values with coded digits
	public int hashIndex(K k);
	//Purpose: To determine if two Keys have equal key value
	public Boolean keyEqual(K k1, K k2);
}
