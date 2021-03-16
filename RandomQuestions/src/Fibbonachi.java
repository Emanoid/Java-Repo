
public class Fibbonachi {
	public Fibbonachi(int c) {Fibbonachil(c);}
	
	public int Fibbonachil(int n) {
		if (n == 1) {
		    return 1;
		} else if (n == 0) {
		    return 0;
		} else {
		    return Fibbonachil(n - 1) + Fibbonachil(n - 2);
		   		}
			
					
		}
	

}
