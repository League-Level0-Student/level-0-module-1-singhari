package _03_if_else._1_unbirthday;
import java.util.Random;

import javax.swing.JOptionPane;
public class unbirthday {
	public static void main(String[] args) {
	String cool = "When is your birthday in mm/dd form?";
	JOptionPane.showInputDialog(null,cool);
	if (cool.equals("06/28")) {
		String er = "Happy Birthday!";
		JOptionPane.showMessageDialog(null,er);
	}
	else {
		String er = "Happy Unbirthday!";
		JOptionPane.showMessageDialog(null,er);
	}
	
	
	}
}
