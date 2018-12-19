import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JackInTheBox implements ActionListener {
	int i;
	public static void main(String[] args) {
		JackInTheBox jack = new JackInTheBox();
		jack.Box();
	}
	public void Box() {
		JFrame frame = new JFrame();
		JButton button = new JButton("Worms Arent Rreal!! You  Know This!!!!");
		frame.setVisible(true);
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
	}
	 private void showPicture(String fileName) {
	     try {
	          JLabel imageLabel = createLabelImage(fileName);
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	private JLabel createLabelImage(String fileName) {
	     try {
	          URL imageURL = getClass().getResource(fileName);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileName);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + fileName);
	          return new JLabel();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		i++;
		if (i > 4) {
			showPicture("jackInTheBox.png");
			JOptionPane.showMessageDialog(null, "hhuhuh guess worm's ARE real!!!");
		}
		
	}
}
