package no.hvl.dat100;

import static java.lang.System.*;

import java.util.Scanner;

public class OppgaveB5{
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int poeng;
		
		out.println("Skriv inn poengsum");
		poeng = sc.nextInt();
		
		
		if (poeng < 40 && poeng > -1) {			
			out.println("Karakter F");
		}
		else if (poeng < 50 && poeng > 39) {
			out.println("Karakter E");
		}
		else if (poeng < 60 && poeng > 49) {
			out.println("Karakter D");
		}
		else if (poeng < 80 && poeng > 59) {
			out.println("Karakter C");
		}
		else if (poeng < 90 && poeng > 79) {
			out.println("Karakter B");
		}
		else if (poeng < 101 && poeng > 89) {
			out.println("Karakter A");
		}
		else {
			out.println("Poengsummen er ugyldig.");
		}
			
		
		
	}
}