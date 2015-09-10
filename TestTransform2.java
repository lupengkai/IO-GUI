import java.io.*;

public class TestTransform2
{
	public static void main(String[] args)
	{
		try
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String s = null;
			s = br.readLine();
			while( s != null)
			{
				if (s.equalsIgnoreCase("exit")) break;
				System.out.println(s.toUpperCase());
				s = br.readLine();
			}
			br.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}