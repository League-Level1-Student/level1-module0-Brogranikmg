/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
                String horsey = "https://dominoeffectexaminer.files.wordpress.com/2014/04/8916631-lg.jpg";
		// 2. create a variable of type "Component" that will hold your image
                Component garbage;
		// 3. use the "createImage()" method below to initialize your Component
                garbage = createImage(horsey);
		// 4. add the image to the quiz window
                quizWindow.add(garbage);
		// 5. call the pack() method on the quiz window
                quizWindow.pack();
		// 6. ask a question that relates to the image
                String crunchable = JOptionPane.showInputDialog("is he ur freind ;)))))????");
		// 7. print "CORRECT" if the user gave the right answer
                if (crunchable.equalsIgnoreCase("yes")) {
                	JOptionPane.showMessageDialog(null, "yeppp :DDDDD ;)))))");
                } else {
                	JOptionPane.showMessageDialog(null, "DIE< IMPERIAL");
                }
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
                quizWindow.remove(garbage);
		// 10. find another image and create it (might take more than one line of code)
                String cruncheon = "https://cdn4.techly.com.au/wp-content/uploads/2015/11/girl-eats-spider-799x423.jpg";
                Component spiderlunch;
                spiderlunch = createImage(cruncheon);
		// 11. add the second image to the quiz window
                quizWindow.add(spiderlunch);
		// 12. pack the quiz window
                quizWindow.pack();
		// 13. ask another question
                String munchable = JOptionPane.showInputDialog("is SHE ur freind ;)))))????");
        		// 7. print "CORRECT" if the user gave the right answer
                        if (crunchable.equalsIgnoreCase("yes")) {
                        	JOptionPane.showMessageDialog(null, "yum, юм :ДДД");
                        } else {
                        	JOptionPane.showMessageDialog(null, "uh oh :ДДДДДДД");
                        }
                        	
		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





