package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class Skatt {

	public static void main(String[]args) {
		int lonn = Integer.parseInt(showInputDialog("l�nn"));

		double[][] sats =
			{
					{ 0.0, 0, 164100},
					{ 0.093, 164101, 230950},
					{0.241, 230951, 580650},
					{0.1152, 580651, 934050},
					{0.1452, 934051, lonn
			}};

		for (int i = 0; i< sats.length; i++) {
			if(lonn>= sats[i][1] && lonn<= sats[i][2]) {
			System.out.println((lonn - (1-sats[i][0])*lonn) + " i skatt");
			}
		}
	}
};
