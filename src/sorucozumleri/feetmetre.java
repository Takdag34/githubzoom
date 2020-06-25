package sorucozumleri;

import java.util.Scanner;

public class feetmetre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("Lütfen feet degerini giriniz : ");
	
	Scanner feet = new Scanner(System.in);
	
	double metre = feet.nextDouble();
	
	double deger = (double) 0.305 * metre;
	
	
	
	System.out.println("girdiginiz feet degeri : " + (double) deger + " metredir ");
	
	feet.close();}

}
