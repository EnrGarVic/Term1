package term1;

import java.util.Scanner;

public class Scannner {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner (System.in);
		System.out.println("Type int number:");
		
		int num1;
		num1 = sc.nextInt(); sc.nextLine();
		//num2 = k.nextInt();
		
		//System.out.println("your average is: "+((num1+num2)/2));
		
		System.out.println("type your name");
		String name = sc.nextLine();
		System.out.println(name+""+ num1);
		System.out.println("End of the programme");
		sc.close();
	}

}
