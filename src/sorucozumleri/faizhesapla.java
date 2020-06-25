package sorucozumleri;

import java.util.Scanner;

public class faizhesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Lütfen ara toplami giriniz :");
		
		Scanner aratoplam = new Scanner(System.in);
		
		double at = aratoplam.nextDouble();
		
		System.out.println(" Lütfen komisyon oranini giriniz :");
		
		Scanner komoran = new Scanner(System.in);
		
		//double ko = komoran.nextDouble();
		
		//double miktar =  ((double) at *(15/100);
		
		//double toplam = (double) at + (double) miktar;
		
		System.out.println(" Komisyon miktari : " + ((double) at *0.15) + " toplami : " + ((double) at + ((double) at) * 0.15));
		
		aratoplam.close();
		komoran.close();
		}

	
}
