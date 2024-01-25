package tasks;

import java.util.Scanner;

public class cOMPAREtO {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Tell me your name and surnames");
		String name= sc.nextLine();
		String surnames= sc.nextLine();
		String fullname= surnames + ", "+ name;
		
		String user= "Perez, Perez, Raquel";
		
		if (fullname.compareToIgnoreCase(user)<0) {
			System.out.println("is in the first part");
			
		}else {
			System.out.println("is in the second part");
		}
		
		sc.close();
		
	}

}
