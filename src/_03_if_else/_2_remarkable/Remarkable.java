package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String fish = "my fish is a waste of space and oxygen";
String dog = "my dog eats her own vomit";
String smallfish = "my smaller fish is weak and pathetic";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String input = JOptionPane.showInputDialog("What is your name");
		// 3. In a pop-up, tell the user what is remarkable about that person.
if(input.equals("dog")) {
	JOptionPane.showMessageDialog(null, dog);
}
if(input.equals("fish")) {
	JOptionPane.showMessageDialog(null, fish);
}
if(input.equals("smallfish")) {
	JOptionPane.showMessageDialog(null, smallfish);
}
	}
}

