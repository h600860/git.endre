package no.hvl.dat100;

import javax.swing.*;

public class O2{
	
	public static void main(String[] args) {
		
		for (int i = 10; i > 0;) {
			String karakter ="";
			String input = JOptionPane.showInputDialog("Skriv inn poengsum");
			int poeng = Integer.parseInt(input);
			
			if (poeng < 40 && poeng > -1) {
				karakter = "F";
			}
			else if (poeng < 50 && poeng > 39) {
				karakter = "E";
			}
			else if (poeng < 60 && poeng > 49) {
				karakter = "D";
			}
			else if (poeng < 80 && poeng > 59) {
				karakter = "C";
			}
			else if (poeng < 90 && poeng > 79) {
				karakter = "B";
			}
			else if (poeng < 101 && poeng > 89) {
				karakter = "A";
			}
			else {
				karakter = "Ugyldig";
			}
			
			if (poeng < 0 || poeng > 100) {
				JOptionPane.showMessageDialog(null, "Din poengsum er ugyldig, skriv inn på nytt");
			}
			else {
				JOptionPane.showMessageDialog(null, "Din karakter er " + karakter);
				i--;
			}
		}
	}
}