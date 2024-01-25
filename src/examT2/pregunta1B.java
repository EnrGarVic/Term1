package examT2;

import java.util.Scanner;

public class pregunta1B {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String city;
		do {
			System.out.print("write the valid city (Valencia, Alicante, Castellon): ");
			city = sc.next(); sc.nextLine();


		} while (!city.equalsIgnoreCase("Valencia") && !city.equalsIgnoreCase("Castellon") && !city.equalsIgnoreCase("Alicante"));

		switch(city) {
		case "valencia":
			System.out.println("the code is 46");
			break;
		case "castellon":
			System.out.println("the code is 12");
			break;
		case "Alicante":
			System.out.println("the code is 46");
			break;
				
		}


		sc.close();
	}

}
