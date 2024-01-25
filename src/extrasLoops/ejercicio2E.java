package extrasLoops;

public class ejercicio2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		int stars = 1;

		for (int i = 0; i < rows; i++) {
		    for (int j = 0; j < rows - i - 1; j++) {
		        System.out.print(" ");
		    }
		    
		    for (int k = 0; k < stars; k++) {
		        System.out.print("*");
		    }
		    
		    System.out.println();
		    stars++;
		}
	}

}
