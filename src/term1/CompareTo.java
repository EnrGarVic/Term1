                                                            package term1;

import java.util.Scanner;

public class CompareTo {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
String text1=sc.nextLine();
String text2=sc.nextLine();
//tex1 > tex2 WRONG!! 
System.out.println(text1.compareTo(text2));
sc.close();
	}

}
