import java.awt.*;

 public class TestMultiFrame
 {
 	public static void main(String[] args)
 	{
 		MyFrame f1 = new MyFrame(100,100,200,200,Color.ORANGE);

 	}
 }

 class MyFrame extends Frame 
 {
 	static int id = 0;
 	MyFrame(int x,int y, int w ,int h, Color color)
 	{
 		super("MyFrame" + (++id));
 		setBackground(color);
 		setLayout(null);
 		setBounds(x,y,w,h);
 		setVisible(true);
 	}
 }