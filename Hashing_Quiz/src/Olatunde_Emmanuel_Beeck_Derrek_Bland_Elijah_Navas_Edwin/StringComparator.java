package Olatunde_Emmanuel_Beeck_Derrek_Bland_Elijah_Navas_Edwin;
/**
 * Class for StringComparator
 */

public class StringComparator implements HashComparator<String>{ 
	protected int a = 11;
	//prime number less than N
	
	//Purpose: Defines a StringComparator
	public StringComparator() { }
	
	public int hashIndex(String k) {
		int slen = k.length();
		int i = -1;
		int code = 0;
		while (i < slen - 1){
			i = i + 1;
			code = (int) k.charAt(i) + a * code;	}		
		return(Math.abs(code));	}
	
	public Boolean keyEqual(String k1, String k2){
		return(k1.equals(k2)); }
	
	}