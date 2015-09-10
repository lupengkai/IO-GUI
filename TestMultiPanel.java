import java.awt.*;

public class TestMultiPanel
{
	public static void main(String[] args)
	{
		new MyFrame2("Ha Ha",200,200,500,500);
	}
}

class MyFrame2 extends Frame
{
	private Panel p1,p2,p3,p4;
	MyFrame2(String s,int x,int y,int w,int h)
	{
		
		super(s);
		setBounds(x,y,w,h);
		setLayout(null);
		p1 = new Panel(null);
		p2 = new Panel(null);
		p3 = new Panel(null);
		p4 = new Panel(null);
		p1.setBounds(0,0,w/2,h/2);
		p2.setBounds(w/2,0,w/2,h/2);
		p3.setBounds(0,h/2,w/2,h/2);
		p4.setBounds(w/2,h/2,w/2,h/2);
		p1.setBackground(Color.BLUE);
		p2.setBackground(Color.ORANGE);
		p3.setBackground(Color.GREEN);
		p4.setBackground(Color.YELLOW);
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		setVisible(true);



	}
}