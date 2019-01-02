import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	public static void main(String[] args) {
		CutenessTV cute = new CutenessTV();
		cute.showButton();
	}
	JButton ducks = new JButton("Click here for some cute ducks!");
	JButton frog = new JButton("Click here for a cute frog!");
	JButton aSpeciesOfSinnerWhichIsCommonlyReferredToAsAUnicorn = new JButton("Please don't click here. Whatever you do, DON'T CLICK THIS BUTTON!");
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(ducks);
		ducks.addActionListener(this);
		panel.add(frog);
		frog.addActionListener(this);
		panel.add(aSpeciesOfSinnerWhichIsCommonlyReferredToAsAUnicorn);
		aSpeciesOfSinnerWhichIsCommonlyReferredToAsAUnicorn.addActionListener(this);
		frame.pack();
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=Nf7CIiobvqY");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ducks) {
			showDucks();
		} else if (e.getSource() == frog) {
			showFrog();
		} else if (e.getSource() == aSpeciesOfSinnerWhichIsCommonlyReferredToAsAUnicorn) {
			showFluffyUnicorns();
		}
		
	}
}
