package pc;

public class producer<X> extends Thread
{ 	
	IBuffer<X> B;
	public producer(IBuffer<X> t) { B = t; }
	@SuppressWarnings("unchecked")

	public void run()
{ 
		int n = 0;

		while (true)
{ 
			if (!B.isFull())
{ 
				B.add((X) (n + ""));

				System.out.println("Produced: " + n);

				n = n + 1; }
}
} }