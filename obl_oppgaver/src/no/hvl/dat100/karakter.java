package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class karakter {
	
	public static void main(String[]args){
		
		int poeng = Integer.parseInt(showInputDialog("poeng"));
		
		String karakter; 
		
		if (poeng >= 39 && poeng <= 0) {
			karakter = "F";
		}else if(poeng >= 49 && poeng <= 40) {
			karakter = "E";
		}else if(poeng >= 50 && poeng <= 59) {
			karakter = "D";
		}else if(poeng >= 60 && poeng <= 79) {
			karakter = "C";
		}else if(poeng >= 80 && poeng <= 89) {
			karakter = "B";
		}else if(poeng >= 90 && poeng <= 100) {
			karakter = "A";
		}else {
			karakter = "Ugyldig";
		};
		showMessageDialog(null, "karakter " + karakter);
		
		}

	}
