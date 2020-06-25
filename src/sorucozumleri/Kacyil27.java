package sorucozumleri;

import java.util.Scanner;

public class Kacyil27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("please give me minutes : ");

		Scanner minute = new Scanner(System.in);
		
		int hour = 60* minute.nextInt();
		
		int day = 24*hour;
		
		int year = day*365;
		
		System.out.println("this minutes : " + year + day + hour);
		minute.close();}

}
