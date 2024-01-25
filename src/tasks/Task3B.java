package tasks;

import java.util.Scanner;

public class Task3B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("whats your numbers?");
		
		int num1 , num2;
	
    num1=  sc.nextInt();
    num2= sc.nextInt()	;
    
	
	System.out.println("suma= "+ (num1+num2));
	System.out.println("substraction= "+ (num1-num2));
	System.out.println("division= "+ (num1/num2));
	System.out.println("multiplication= "+ (num1*num2));
	sc.close();
	}

}
