package extrasLoops;

public class ejercicio2C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int linea=5;
		
	for (int i = 0; i < linea; i++) {
		for (int j = 0; j < i; j++) {
			System.out.print(" ");
		}
		for (int k = i; k < linea; k++) {
	        System.out.print("*");
	}
		System.out.println();
	
		}

	}
}

