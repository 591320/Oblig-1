package no.hvl.dat100;


import static javax.swing.JOptionPane.*;


public class Skatt {
	



 public static void main(String[] args) {
		
	 
	 String TallTxt = showInputDialog("Skriv inn bruttolønn: ");
	 double brutto = Double.parseDouble(TallTxt);
	 double trinn1, trinn2, trinn3, trinn4;
	  
		if (brutto <= 164100) {
				showMessageDialog(null, "Trinnskatt 0%, betalt skatt: " + 0);
				
		} else if (brutto > 164100 && brutto <= 230950 ) {
            trinn1 = (brutto - 164100)*0.0093;  
			showMessageDialog(null, "Trinnskatt 0.93%, betalt skatt: " + trinn1);
			
		} else if (brutto > 230950 && brutto <= 580650) {
			trinn2= (230950-164100)*0.0093 + (brutto-230950)*0.0241;
			showMessageDialog(null, "Trinnskatt 2.41%, betalt skatt: " + trinn2);
		
		} else if (brutto > 580650 && brutto <= 934050) {
			trinn3= (230950-164100)*0.0093 + (580650-230950)*0.0241 + (brutto-580650)*0.1152;
			showMessageDialog(null, "Trinnskatt 11.52%, betalt skatt: " + trinn3);
			
		} else if (brutto > 934050) {
			trinn4= (230950-164100)*0.0093 + (580650-230950)*0.0241 + (934050-580650)*0.1152 + (brutto-934050)*0.1452;
			showMessageDialog(null, "Trinnskatt 14.52%, betalt skatt: " + trinn4);
 
		}
 }			

}
