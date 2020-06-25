package sorucozumleri;

import java.util.Scanner;

public class dikdortgenalan {

	static void alanHesapla(double a, double b) {
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner genis = new Scanner(System.in);
		
		System.out.println("lutfen dikdortgenin genisligini giriniz : ");
		
		double g = genis.nextDouble();
		
		System.out.println("lutfen dikdortgenin yüksekligini giriniz : ");
		
		Scanner yuksek = new Scanner(System.in);
		
		double y = yuksek.nextDouble();		
		
		double area = g*y;
		
		System.out.println("area : " + (double) area);
		
		genis.close();
		yuksek.close();
		
		
		

	}

}
