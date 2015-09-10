import java.awt.*;
import java.awt.event.*;


public class TestKeyEvent{
	public static void main(String[] args) {
		new KeyFrame().launchFrame();

	}
}

class KeyFrame extends Frame {
	public void launchFrame() {
		setLocation(300,300);
		setSize(200,200);
		addKeyListener(new KeyMonitor());
		setVisible(true);

	}
	class KeyMonitor extends KeyAdapter {
		public void keyPressed(KeyEvent e){
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				System.out.println("up");
			}
			else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				System.out.println("down");
			}
		}
	}
}