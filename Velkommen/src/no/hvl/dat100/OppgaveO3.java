package no.hvl.dat100;

import java.util.Scanner;
import static java.lang.System.*;

public class OppgaveO3{
	
	public static void main(String[] args) {
		int n, i, f = 1;
		
		out.println("Skriv inn ett tall for å beregne fakulteten!");
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		
		if (n < 0)
			out.println("Tallet er ugyldig");
		else {
			for (i = 1; i <= n; i++)
				f = f*i;
		
			out.println("Fakultet av " + n + "=" + f);
		}
	}
}