import java.awt.*;

public class TestFrame
{
	public static void main(String[] args)
	{
		Frame f = new Frame("My First Frame");
		f.setVisible(true);
		f.setLocation(300,300);
		f.setSize(170,100);
		f.setBackground(Color.BLUE);
		f.setResizable(false);
	}
}