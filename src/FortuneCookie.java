import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie munchcrunch = new FortuneCookie();
		munchcrunch.showButton();
	}
	
	public void showButton() {
		JFrame privettovarischi = new JFrame();
		privettovarischi.setVisible(true);
		JButton wormsarentreal = new JButton();
		privettovarischi.add(wormsarentreal);
		wormsarentreal.setText("Click me, дурак!");
		wormsarentreal.addActionListener(this);
		privettovarischi.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		int randomizedcrimes = new Random().nextInt(5);
		String collectedworksofshakespeare = "";
		switch (randomizedcrimes) {
		case 0:
			collectedworksofshakespeare = "You will die.";
			break;
		case 1:
			collectedworksofshakespeare = "The next time you yawn, thousands of bees will fly out.";
			break;
		case 2:
			collectedworksofshakespeare = "Look behind you.";
			break;
		case 3:
			collectedworksofshakespeare = "Your dreams are prophetic, but only the nightmares.";
			break;
		case 4:
			collectedworksofshakespeare = "Я не живо. Здесь всё — мёртвое.";
			break;

		}
		JOptionPane.showMessageDialog(null, collectedworksofshakespeare);
		
	}
}
