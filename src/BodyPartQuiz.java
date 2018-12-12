/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// 0. You can use the celebrity photos we have placed in the default java package,  
	// or if you prefer, get celebrity photos from the Internet, place them in the default
	// package, and change the names below.
	
	String firstImage = "src/arnold.jpeg";
	String secondImage = "src/leonardo.jpeg";
	String thirdImage = "src/morgan.jpeg";
	String fourthImage = "src/jack.jpeg";
	
	JFrame window = new JFrame();
	JPanel panel = new JPanel();


	private void startQuiz() {

		// 1. Make an int variable to hold the score.
		int score = 96;
		// 2. Set the size of the window in the initializeGui() method below
		// 4. Ask the user who this person is and store their answer
		String guess = JOptionPane.showInputDialog("who is this?");
		if (guess.equalsIgnoreCase("mr. hair") || guess.equalsIgnoreCase("mr hair")) {
			JOptionPane.showMessageDialog(null, "you  correct fool. you\"r absloutely righ t");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "no!!!! its world-Famous актёр mr. hair ,");
		}
		showNextImage();
		JOptionPane.showMessageDialog(null, "ccurrent scorE; " + score);
		
		// 9. .... repeat for all your images.....
		guess = JOptionPane.showInputDialog("who,s this then.");
		if (guess.equalsIgnoreCase("leonardo davinci")) {
			JOptionPane.showMessageDialog(null, "smart . you did Not get him  .confused. with the Famous Painter lenoardo di carpio");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "**leardo davinci**");
		}
		showNextImage();
		JOptionPane.showMessageDialog(null, ",,,Curren! tScore! :" + score);

		guess = JOptionPane.showInputDialog("You. Will never Figure; out \"this.\" celebrity,");
		if (guess.equalsIgnoreCase("mortal freeman")) {
			JOptionPane.showMessageDialog(null, "ok Fair enough(");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "you are'nt EVER a world=famuos celebrity Expertt because .., it wa s,,,,, MORTAL FREEMAN");
		}
		showNextImage();
		JOptionPane.showMessageDialog(null, "куррент Скор" + score);
		
		guess = JOptionPane.showInputDialog("noboody has  h eard of [CELEBRITY .. maybe -YOu- can !!");
		if (guess.contains("unknown")) {
			JOptionPane.showMessageDialog(null, "RIGHT ! nobody know's yet ");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "hey Listen write here mr Wrong,, thiscelebrit is secret \"&\" noone knows who theyre * itsUknown");
		}
		JOptionPane.showMessageDialog(null, "yoUr .sCorE.   " + score);
		
		switch(score) {
		case 96:
			JOptionPane.showMessageDialog(null, "ok listen here Bud.  take Away a momen tof youre ttime Bucko. you don\"t knovv ANY celebrity's and \"4\" Dat ur goin'. to. Jail ,learn bettter nexttime ,");
			break;
		case 97:
			JOptionPane.showMessageDialog(null, "a'ight Freind u know 1 celebrety {out of the `Four` in the WOrld ) but thats O. K. keep learnen' and 1 day U  may nnow every celebertie!!!! !!");
			break;
		case 98:
			JOptionPane.showMessageDialog(null, "to qoute a common frase ,. ''Your Right in The midle'' your right in the middle. yo ugot 2 outta 4r and THats \nGreat!!!!! good job your the best,,,,, (not yet but ur close KEEP TRYiN\"");
			break;
		case 99:
			JOptionPane.showMessageDialog(null, "ya Gotta lern $about$ '1` MORE ceLEBRit y!!   ur ALMOSTTTT:  their just ;KEep TRYIN your  ALMOST a CeLeBIrity!!! ExperRtT!!!! woooWOoooWOoooOOOooOowwWw!!");
			break;
		case 100:
			JOptionPane.showMessageDialog(null, "O.M.G.. (oH mY Gosh,,,) yuo kn0w EveRY ce:lebrty!!!!!\n! w. wh... ewhhge whhhat! are oyu goint o do, with This ,new Found  lnowledge!!! AAAAAAHHaAHAHHHHHHHHHHHHHHHH whAT a ProfEsiional ur So Smart!!!!! AAAAA");
			break;
		}
	}

	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());		
		window.setVisible(true);
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		
		// 3. Change the size of the window so that you can only see part of the image.		
		window.setSize(20, 175);
		
		showNextImage();
		
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fourthImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		System.exit(0);
		return new JLabel();
	}
}
