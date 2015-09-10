import java.awt.*;
import java.awt.event.*;

public class TFMath
{
	public static void main(String[] args)
	{
		new TFMFrame();

	}
}

class TFMFrame extends Frame
{
	TextField tf1,tf2,tf3;
	public TFMFrame()
	{
		//TextField tf1,tf2,tf3;

		tf1 = new TextField(10);
		tf2 = new TextField(10);
		tf3 = new TextField(15);
		Label lblPlus = new Label("+");
		Button b = new Button("=");
		//setLayout(new Gridlayout(1,5));
		b.addActionListener(new MyMonitor(this));
		setLayout(new FlowLayout());
		add(tf1);
		add(lblPlus);
		add(tf2);
		add(b);
		add(tf3);
		pack();
		setVisible(true);


	
		
		

	}
}

class MyMonitor implements ActionListener
{
	TFMFrame tf;
	public MyMonitor(TFMFrame tf)
	{
		this.tf = tf;

	}
	public void actionPerformed(ActionEvent e)
	{
		int n1 = Integer.parseInt(tf.tf1.getText());
		int n2 = Integer.parseInt(tf.tf2.getText());
		tf.tf3.setText("" + (n1 + n2));


	}
}


