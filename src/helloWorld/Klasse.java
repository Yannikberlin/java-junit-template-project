package helloWorld;

import java.util.*;

public class Klasse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Zahl 1: ");
		double zahl1 = sc.nextInt();
		System.out.println("Zahl 2: ");
		double zahl2 = sc.nextInt();
		
		Klasse obj = new Klasse();
		double erg = obj.addiere(zahl1,zahl2);
		System.out.println(erg);
		
		
	}
	public double addiere(double x, double y) {
		double erg = x+y;
		return erg;
	}
	
	public double subtrahiere(double x, double y) {
		double erg = x-y;
		return erg;
	}
	
	public double multipliziere(double x, double y) {
		double erg = x*y;
		return erg;
	}
	
	/*Klasse +- 3 Funkt.
	Tests
	Github (2 Commits)
	Travis bauen lassen
	link zum Repository schicken: Yannikberlin/HalloISE
	
	1 programm schreiben
- ca. 3 funktionen
-ca. 3 testcases
-mindestens 2 commits bei github
-von travis ci bauen lassen*/
}
