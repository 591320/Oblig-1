package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class fakultet {

		
	
	public static void main(String[] args) {
		
		String NTall = showInputDialog("Skriv inn N: ");
		int n = Integer.parseInt(NTall);
		int fakultet = 1 ;
			if (n>0) {
				for ( ; n>0; n-- ) {
			
						
						fakultet*= n;
						
									}
				
				System.out.println(fakultet);
			}
		}
	}
