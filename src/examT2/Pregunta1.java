package examT2;

import java.util.Scanner;

public class Pregunta1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String num;
		do {
			System.out.print("write the code of the province (03,12 o 46): ");
			num = sc.next(); sc.nextLine();
			
			
		} while (!num.equals("03") && !num.equals("12") && !num.equals("46"));
		
		
		switch(num) {
		case "03":
			System.out.println("Alicante");
			break;
		case "12":
			System.out.println("Castellon");
			break;
		case "46":
			System.out.println("Valencia");
			break;
	
		}
		sc.close();
	}
	

}

