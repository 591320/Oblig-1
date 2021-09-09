package no.hvl.dat100;

import static javax.swing.JOptionPane.*;


public class Karakter {

	public static void main(String[] args) {

		int poeng;
		
		for (int i=0; i < 10; i++) {
		
			String poengsum = showInputDialog("Hvilken poengsum fikk du? ");
			 poeng = Integer.parseInt(poengsum);
			 
			if (poeng >= 90 && poeng <= 100) {
				showMessageDialog(null,"Karakter A");
			} else if (poeng < 90 && poeng >=80) {
				showMessageDialog(null,"Karakter B");
			} else if (poeng < 80 && poeng >=60) {
				showMessageDialog(null,"Karakter C");
			} else if (poeng < 60 && poeng >=50) {
				showMessageDialog(null,"Karakter D");
			} else if (poeng < 50 && poeng >= 40) {
				showMessageDialog(null,"Karakter E");
			} else if (poeng < 40 && poeng >= 0) {
				showMessageDialog(null,"Karakter F, Stryk");
			} else {
				showMessageDialog(null,"Error: skriv inn tall mellom 0 og 100");
				i--; 
			}
		}
	}
}
