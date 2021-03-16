package pc;
import java.util.concurrent.Semaphore;

public class producer2<X> extends Thread
{ 
	IBuffer<X> B; Semaphore s;

	public producer2(IBuffer<X> t, Semaphore buffersem)
{ 
		B = t; s = buffersem;
		}
	@SuppressWarnings("unchecked")

	public void run()
{ 
		int n = 0;

		while (true)
{
			
	try{ 
		s.acquire(); 
		}
	catch(InterruptedException e) {}

	if (!B.isFull())
{
		B.add((X) (n + ""));
		
		System.out.println("Produced: " + n);

		n = n + 1;
}
	

	s.release(); } } }