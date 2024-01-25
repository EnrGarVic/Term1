package extrasLoops;

public class ejercicio2D {

	public static void main(String[] args) {
		
		int linea=5;
		
	for (int i = 0; i < linea; i++) {
		for (int j = 0; j < i; j++) {
			System.out.print("");
		}
		for (int k = i; k < linea; k++) {
	        System.out.print("*");
	}
		System.out.println();
	
		}

	}
}

