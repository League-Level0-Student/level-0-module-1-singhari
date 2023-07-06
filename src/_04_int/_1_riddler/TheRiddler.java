package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle = "Which word in the dictionary is spelled incorrectly?";
String ans = JOptionPane.showInputDialog(null,riddle);
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(ans.equals("incorrectly")) {
	String er = "Correct";
	JOptionPane.showMessageDialog(null,er);
	score++;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	String er = "wrong";
	JOptionPane.showMessageDialog(null,er);
}
//null means?
		// 6. Add some more riddles
//What has a neck but no head?
String market = "What has a neck but no head?";
String wer = JOptionPane.showInputDialog(null,market);
if(wer.equals("a bottle")) {
	String er = "Correct";
	JOptionPane.showMessageDialog(null,er);
	score++;
}
		
//r
else {
	String er = "wrong";
	JOptionPane.showMessageDialog(null,er);
		// 2. Make a pop up to show the score.
		
	}
	}
}

