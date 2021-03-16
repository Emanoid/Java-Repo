
public class GCD {
		
	public GCD(int first, int second) {
		int l=first;
		int m=second;
		System.out.println("The GCD of "+l+" and "+m+" is" );
			getGGCD(first, second);	}
	public int getGGCD(int a, int b) {
		if(a%b==0) { return b;}
			else { 	return getGCD(a, b);}	}
	public int getGCD(int a, int b) {
		//int r = (a%b);
		//a = b*q + r;
		int k=1111111;
		 if(a%b!=0) {int r = (a%b);
						 b = (r * (b/r)) + (b%r);
						 //r = ((b%r)* (r/(b%r)) + (r%(b%r));
						 if((r%(b%r))==0) {
							return (b%r);}
						 else {a= r; b=(b%r);
						 	return getGCD(a,b);
						 }}
		 else{return k;}}
	
	public int gcd(int p, int q) {
if (q == 0) {
    return p;}

return gcd(q, p % q);}   }

/* SHORTCUT
public int gcd(int p, int q) {
if (q == 0) {
    return p;
}
return gcd(q, p % q);}
*/