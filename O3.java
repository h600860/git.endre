package no.hvl.dat100;

import java.util.Scanner;

public class O3{
	
	public static void main(String[] args) {
		int n, i, f = 1;
		
		System.out.println("Skriv inn ett tall for å beregne fakulteten!");
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		
		if (n < 0)
			System.out.println("Tallet er ugyldig");
		else {
			for (i = 1; i <= n; i++)
				f = f*i;
			
			System.out.println("Fakultet av " + n + "= " + f);
		}
	}
}