package view;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a,b,c;
		Scanner scan = new Scanner(System.in); //objekat skenera  scan za citanje ulaza sa tastature
		
		System.out.println("Unesi prvi broj ");//Ispis poruke
		int a = scan.nextInt();
		
		System.out.println("Unesi drugi broj ");
		int b = scan.nextInt();
		
		int c = a + b;
		System.out.println(" Zbir brojeva " + a + " i " + b +  " je " + c);
		
	}

}
