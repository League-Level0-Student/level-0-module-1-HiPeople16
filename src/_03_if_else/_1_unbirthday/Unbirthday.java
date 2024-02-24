package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("When is your birthday");
		if(input.equals("2/24/24")){
			JOptionPane.showMessageDialog(null, "Happy Birhtday");
		} else {
		JOptionPane.showMessageDialog(null, "Welp");
		}
	}
}