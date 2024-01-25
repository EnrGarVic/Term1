package exam;

import java.util.Scanner;

public class three {

	public static void main(String[] args) {
/*Write a program in Java that inputs three marks. 
 * The program has to check if ALL the marks are greater than or equal to 4. 
 * If they are, the average has to be calculated. Otherwise, the programs says “you need, 
 * at least 4, in each mark”. If you calculate the average, then you have to say “you pass” 
 * if the mark is greater than or equal to 5, and otherwise, “you fail” 		
 */
		Scanner sc= new Scanner(System.in);
		System.out.println("tell me three marks");
		
		double mark1= sc.nextDouble();
		double mark2= sc.nextDouble();
		double mark3= sc.nextDouble();
		
		double average= (mark1+mark2+mark3)/3;
		
		
		
         if (mark1<4 || mark2  <4 || mark3 <4 && average >=5) {
        	System.out.println("you need, at least 4, in each mark");
         }
       
        else if(mark1>=4 && mark2 >=4 && mark3 >=4 && average >=5) {
                System.out.println("you pass");
                
        		}
        else {
        	System.out.println("you fail");
        
        }
        
		sc.close();

}
}