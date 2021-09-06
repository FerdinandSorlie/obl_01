package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
 
public class fakultet {
	
	public static void main(String[]args) {
		
		int tall = Integer.parseInt(showInputDialog("fakultet"));
		int fakultet = 1; 
		String ut = tall +"! = ";
		
		for(int i = 1; i < tall + 1; i++) {
			fakultet = fakultet*i;
			ut += "*"+i;
		};
		ut += " = "+fakultet; 
		showMessageDialog(null, ut); 
		
		
		
		
		
	}

}
