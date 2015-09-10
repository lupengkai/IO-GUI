import java.awt.*;
import java.awt.event.*;


public class TestAnonymous {
	Frame f = new Frame();
	TextField tf = new TextField();
	Button b = new Button("Start");
	public TestAnonymous() {
		f.add(tf,BorderLayout.SOUTH);
		f.add(b,BorderLayout.NORTH);
		b.addActionListener(
		new ActionListener()
		{
			private int i = 0;
			public void actionPerformed(ActionEvent e)
			{
				tf.setText(e.getActionCommand() + ++i);

			}

		}
		);
	    f.addWindowListener( new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}

		});
	f.pack();
	f.setVisible(true);


	}
	public static void main(String[] agrs) {
		new TestAnonymous();
	}
	
}