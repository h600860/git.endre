package no.hvl.dat100;

import static java.lang.System.*;
import java.util.Scanner;

public class Innlevering2
{
	
	public static void main(String[] args)
{
		Scanner sc = new Scanner(System.in);
		double bruttoinntekt;
		
		out.println("Skriv inn bruttoinntekt");
		bruttoinntekt = sc.nextDouble();
		
		if (bruttoinntekt < 184801) {			
			out.println("Ingen trinnskatt"); 
		}
		else if (bruttoinntekt < 260101) {
			out.println("1,7% trinnskatt");
		}
		else if (bruttoinntekt < 651251) {
			out.println("4,0% trinnskatt");
		}
		else if (bruttoinntekt < 1021551) {
			out.println("13,2% trinnskatt");
		}
		else{
			out.println("16,2% trinnskatt");
		}


}
}