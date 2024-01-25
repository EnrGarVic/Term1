package extrasLoops;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
			String sentence = sc.nextLine();
			
			for (int i = sentence.length()-1; i >=0; i--) { 
				System.out.println(sentence.charAt(i)+"\f");
				}
				sc.close();
		
			}

	}



