package FlowControl;

import java.util.Scanner;

public class RepasoClase3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Put a text and number");
		
		String text=sc.nextLine();
		int num=sc.nextInt();  sc.nextLine();
		
	
		
		if (num > text.length()) {
			System.out.println("You cant");
		}else {
			System.out.println("Result: " + text.charAt(num - 1) );
		}
		sc.close();
	}

}
