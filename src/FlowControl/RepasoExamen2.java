package FlowControl;

import java.util.Scanner;

public class RepasoExamen2 {

	public static void main(String[] args) {
    java.util.Scanner sc= new Scanner(System.in);
		
		System.out.println("Tell me yor mark ");
		
		int mark= sc.nextInt();
		switch(mark) {
		case 0,1,2,3,4:
			System.out.println("insuficiente");
		break;
		case 5:
			System.out.println("suficiente");
			break;
		case 6:
			System.out.println("bien");
			break;
		case 7,8:
			System.out.println("Notable");
		break;
		case 9,19:
			System.out.println("Sobresaliente");
		break;
		default:
			System.out.println("mal");
		}
		sc.close();
	}

}
