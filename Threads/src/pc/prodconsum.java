package pc;

public class prodconsum
{
	private static stringBuffer buffer = new stringBuffer(5);
	public static void main(String[] args)
{ 
		Thread c = new consumer<String>(buffer);
		Thread p = new producer<String>(buffer);
		c.start();
		p.start();
}
}
