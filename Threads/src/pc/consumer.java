package pc;
public class consumer<X> extends Thread
{ 
	IBuffer<X> B;
	public consumer(IBuffer<X> t) { B = t; }
	
	public void run()
{ 
		X t;

		while (true)
{ 
			if (!B.isEmpty())
{
				t = B.remove();
				
				System.out.println("        Processed: " + t);
}
}
} }