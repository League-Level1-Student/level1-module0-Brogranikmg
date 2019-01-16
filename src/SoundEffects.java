import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {
	public static void main(String[] args) {
		SoundEffects sound = new SoundEffects();
		sound.showButton();
	}
	JButton crunch = new JButton("Crunch!");
	JButton caw = new JButton("Caw!");
	JButton hiss = new JButton("Hiss!");
	JButton scream = new JButton("Scream!");
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(crunch);
		crunch.addActionListener(this);
		panel.add(caw);
		caw.addActionListener(this);
		panel.add(hiss);
		hiss.addActionListener(this);
		panel.add(scream);
		scream.addActionListener(this);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == crunch) {
			playSound("crunch.wav");
		} else if (arg0.getSource() == caw) {
			playSound("cruelbirds.wav");
		} else if (arg0.getSource() == hiss) {
			playSound("hiss.wav");
		} else if (arg0.getSource() == scream) {
			playSound("scream.wav");
		}
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}
}
