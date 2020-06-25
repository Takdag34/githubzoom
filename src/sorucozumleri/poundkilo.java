package sorucozumleri;

import java.util.Scanner;

public class poundkilo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Pound degerini giriniz : ");
		
		Scanner scan = new Scanner(System.in);
		
		double kilo = scan.nextDouble();
		
		double deger = (double) kilo * 0.454;
		
		System.out.println((double) kilo + " Pounds esittir : " + deger + " kilodur ");
		
		
		

		scan.close();}

}
