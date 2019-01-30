import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ouch implements KeyListener {
	public static void main(String[] args) {
		Ouch oof = new Ouch();
		oof.start();
	}
	JLabel label = new JLabel("Hello! Don't you dare press a button!");
	void start() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.addKeyListener(this);
		panel.add(label);
		frame.pack();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		label.setText("AAAAAAAAH! NO!");
	}
	@Override
	public void keyReleased(KeyEvent e) {
		label.setText("Ouch! Why did you do that!?");
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
