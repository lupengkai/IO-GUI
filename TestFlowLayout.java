import java.awt.*;


public  class TestFlowLayout
{
	public static void main(String[] args)
	{
		Frame  f = new Frame("haha");
		Button b1 = new Button("a");
		Button b2 = new Button("b");
		Button b3 = new Button("c");
		f.setLayout(new FlowLayout(FlowLayout.LEFT));
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.setVisible(true);
	}
}
