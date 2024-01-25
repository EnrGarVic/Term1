package FlowControl;

import java.util.Scanner;

public class Task5_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);	
		System.out.println("say one year");
		int year= sc.nextInt();
		
		if((year %4==0 && year %100!=0) || (year %400==0)) {
			
			System.out.println("its a leap year");
		}
		else {
			System.out.println("not a leap year");
		    
	}
	sc.close();
	}
}


