import java.awt.*;
import java.awt.event.*;


public class TestActionEvent
{
	public static void main(String[] args)
	{
	Frame f = new Frame("Ha Ha");
	Button b = new Button("Click me");
	Button b2 = new Button("Click me");
	Monitor m = new Monitor();
	b.addActionListener(m);
	b2.addActionListener(m);
	b2.setActionCommand("haha");
	f.add(b,BorderLayout.CENTER);
	f.add(b2,BorderLayout.NORTH);
	f.pack();
	f.setVisible(true);
}
}

class Monitor implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("CLicked" + e.getActionCommand());
	}
}