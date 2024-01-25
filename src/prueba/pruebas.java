package prueba;

import java.util.Scanner;

public class pruebas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sick=0;
		int totalsick = 0;

		while (sick >= 0) {
			totalsick += sick;
			System.out.println("tell me your number of sick days(negative number to exit)");
			sick = sc.nextInt();
		}
		System.out.println("the total numbers is: " + totalsick);
		sc.close();
	}
}
