package pc;

import java.util.concurrent.Semaphore;

public class consumer2<X> extends Thread
{ 
	IBuffer<X> B; Semaphore s;
	
	public consumer2(IBuffer<X> t, Semaphore sembuffer)
{ 
		B = t; s = sembuffer; 
		}

	public void run()
{
		X t;

		while (true)
{

			try { 
				s.acquire();
				}
			catch(InterruptedException e) {}

			if (!B.isEmpty())
{ 
				t = B.remove();

				System.out.println("Processed: " + t);
}

			s.release();
} } }
