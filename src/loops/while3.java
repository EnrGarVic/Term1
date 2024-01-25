package loops;

public class while3 {
	public static void main(String[] args) {
		char letter = 'a';
		while (letter <='z') {
		System.out.print(letter + "\t");
		if (letter=='n') {
			System.out.print("ñ\t");
		} 
		letter++;
		}
	}
}
