package no.hvl.dat100;

import static java.lang.System.*;
import java.util.Scanner;

public class O1{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double bruttoinntekt;
		
		out.println("Skriv inn bruttoinntekt");
		bruttoinntekt = sc.nextDouble();
		
		if (bruttoinntekt < 164101) {
			out.println("Du behøver ikke å betale trinnskatt");
		}
		
		else if (bruttoinntekt < 230951) {
			out.println("Du må betale 0,93% i trinnskatt som tilsvarer " + bruttoinntekt*0.0093 + "kr");
		}
		
		else if (bruttoinntekt < 580651) {
			out.println("Du må betale 2,41% i trinnskatt som tilsvarer " + bruttoinntekt*0.0241 + "kr");
		}
		
		else if (bruttoinntekt < 934051) {
			out.println("Du må betale 11,52% i trinnskatt som tilsvarer " + bruttoinntekt*0.1152 +"kr");
		}
		
		else {
			out.println("Du må betale 14,52% i trinnskatt som tilsvarer " + bruttoinntekt*0.1452 +"kr");
		}
	}
	
}