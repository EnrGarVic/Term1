package loopstask7;

import java.util.Scanner;

public class task7_9b {

	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
				for(int i=0; i<=10; i++) {
					
					//System.out.println("--"+j+"--");
					for(int j=1; j<=4; j++) {

						System.out.print(j + "x" + i + "=" + i*j +"          ");
					}
					System.out.println();
				
				}
				sc.close();
	}

}
