package examT2;

import java.util.Random;
import java.util.Scanner;

public class pregunta2B {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc= new Scanner(System.in);


		int mScore=25;
		int sum2=0;
		int sum=0;

		System.out.println("Player1: how many dice you want to roll?");
		int player1=0;

		player1= sc.nextInt();
		System.out.println("Player2: how many dice you want to roll?");
		int player2=0;

		player2= sc.nextInt();
		System.out.print("player1: ");
		for (int i = 0; i <player1; i++) { 

			int dice1= r.nextInt(6)+1;
			sum+=dice1;
			System.out.print("\t"+dice1);

		}
		System.out.print("\n player2: ");
		for (int j = 0; j <player2; j++) { 

			int dice2= r.nextInt(6)+1;
			sum2+=dice2;
			System.out.print("\t"+dice2);
		}
		System.out.println("\ntotal player1= "+ sum);
		System.out.println("total player2= "+ sum2);

		if( sum<=mScore && sum2<=mScore) {
			if(sum >sum2) {
				System.out.println("player 1 win");
			}else if(sum2 >sum) {
				System.out.println("player 2 win");
			}else {
				System.out.println("draw");
			}
		}else {
			if(sum<=mScore) {
				System.out.println("player 1 win!!");
			}else if(sum2<=mScore) {
				System.out.println("player 2 win!!");

			}else {
				System.out.println("both lose");
			}
		}
		sc.close();
	}
}
