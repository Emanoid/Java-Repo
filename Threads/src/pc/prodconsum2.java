package pc;

import java.util.concurrent.Semaphore;
public class prodconsum2
{
	private static stringBuffer buffer = new stringBuffer(10);
	private static Semaphore bufferSemaphore = new Semaphore(1);

	public static void main(String[] args)
{
	Thread c = new consumer2<String>(buffer, bufferSemaphore);
	Thread p = new producer2<String>(buffer, bufferSemaphore);
	c.start();
	p.start();
}
}
