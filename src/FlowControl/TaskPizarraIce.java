package FlowControl;

import java.util.Scanner;

public class TaskPizarraIce {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Whats the temperature of your cup of watter?");
	//for ice -4 or 0 for water the 50 and for vapour the 100 and 150
	int temp= sc.nextInt();
	if(temp <=0) {
		System.out.println("its ice");
	}
	else if (temp <100) {
		System.out.println("Its water");
	}else {
		System.out.println("its vapour");
	}
	sc.close();
	}

}
