package FlowControl;

import java.util.Scanner;

public class Task5_5 {

	public static void main(String[] args) {
		/*Write down three possible values for the extra variable, 
		 * so that you consider that the code would be perfectly 
		 * tested and say also the output produced by it. 
		 */
		Scanner sc= new Scanner(System.in);
		System.out.println("Whats your size?");
		int extra = sc.nextInt();
		if (extra < 0)

		   System.out.println("small");
		else if (extra == 0)

		   System.out.println("medium");

		else 
		      System.out.println("large");
			  sc.close();
	}

}
