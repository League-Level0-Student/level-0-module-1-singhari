package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String Kim = "Likes to read";
String Mira = "Is a pirate captain";
String Ash = "Goes to the zoo often";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String input = JOptionPane.showInputDialog("Pick either Kim, Mira or Ash to learn about.");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if (input.equals("Kim")) {
	JOptionPane.showMessageDialog(null,Kim);
}
if (input.equals("Mira")) {
	JOptionPane.showMessageDialog(null,Mira);
}
if (input.equals("Ash")) {
	JOptionPane.showMessageDialog(null,Ash);
}
else {
	String er = "that's not an option.";
	JOptionPane.showMessageDialog(null,er);
}
//JOptionPane.showMessageDialog(null,"Hello "+input);
	}
}

