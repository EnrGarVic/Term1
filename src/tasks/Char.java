package tasks;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		char letter;
       letter= sc.nextLine().charAt(0);
       
       if (letter !='A' && letter != 'E' && letter != 'I'&& letter !='O'&& letter !='U') {
    	   System.out.println("its not a vowel");
    	   
       }else {
    	   System.out.println("it is vowel");
       }
	   sc.close();
	}

}
