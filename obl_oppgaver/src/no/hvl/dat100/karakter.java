package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class karakter {

	public static void main(String[]args){



		String karakter = "" ;
		String output = "karakerer";
		for(int i = 0; i < 10; i++){
		int poeng = Integer.parseInt(showInputDialog("poeng"));
		if (poeng <= 39 && poeng >= 0) {
			karakter = "F";
		}else if(poeng <= 49 && poeng >= 40) {
			karakter = "E";
		}else if(poeng <= 59 && poeng >= 50) {
			karakter = "D";
		}else if(poeng <= 79 && poeng >= 60) {
			karakter = "C";
		}else if(poeng <= 89 && poeng >= 80) {
			karakter = "B";
		}else if(poeng <= 100 && poeng >= 90) {
			karakter = "A";
		}else {
			showMessageDialog(null, "det du skrev in var ugyldig. prøv igjen");
			i--;
		};
		output += karakter;

		}
		showMessageDialog(null, output);

		}

	}
//test
