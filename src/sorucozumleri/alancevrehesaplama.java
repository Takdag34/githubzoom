package sorucozumleri;

import java.util.Scanner;

public class alancevrehesaplama {

	public static void main(String[] args) {

	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Lütfen yaricapi giriniz");
	
	double yaricap = scan.nextDouble();
	
	double cevre = (2 * yaricap * 3.14);
	
	double alan =  (yaricap * yaricap * 3.14);
	
	System.out.println("alan : " + alan);
	
	System.out.println("cevre : " + cevre);
	

	scan.close();	}
}


