
public class FibonnachiSum {
	int zero = 0;
	int one = 1;
	int i;
	int d;
	int c=0;
	public FibonnachiSum(int n) {
		d= fibbonachi(i);
		for(i=0;i<=n;i++) {
			if((fibbonachi(i) <=n)&&((fibbonachi(i)%2)==0)) {
			c++;
			System.out.println("Even Fibonnachi "+c+" :"+fibbonachi(i));
			d = d + fibbonachi(i);
			System.out.println("sum: "+d);
			}
			}
}

	public int fibbonachi(int b) {
		if(b==0) {return zero;}
		else if(b==1) {return one;}
		else {return (fibbonachi(b-1)+fibbonachi(b-2));}
	
}
}