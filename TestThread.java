import java.lang.*;

class Runner1 implements Runnable
{
	public void run()
	{
		for(int i = 0; i <= 100; i++)
		{
			System.out.println("Runner " + i);
		}

	}
}


public class TestThread
{
	public static void main(String[] args)
	{
		Runner1 r = new Runner1();
		Thread t = new Thread(r);
		t.start();
		for(int i = 0;i <= 100;i++)
			{
				System.out.println("Main------" + i);
			}
	}
	
}