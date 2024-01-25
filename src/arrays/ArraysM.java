package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysM {

	public static void fillArray(int[]v) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Type " + v.length+ " ints");
		for (int i = 0; i < v.length; i++) {
			v[i]= sc.nextInt();
		}
		sc.close();
	}		
	public static void fillArray(double[]v) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Type " + v.length+ " doubles");
		for (int i = 0; i < v.length; i++) {
			v[i]= sc.nextDouble();
		}
		sc.close();

	}
	public static void fillArray(String[]v) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Type " + v.length+ " String");
		for (int i = 0; i < v.length; i++) {
			v[i]= sc.nextLine();

		}
		sc.close();
	}
	public static void fillArrayRandom(int[]v) {
		Random r= new Random();
		System.out.println("Type  " + v.length+ "  ints");
		for (int i = 0; i < v.length; i++) {
			v[i]= r.nextInt(100);
		}
	}		
	public static void bubbleSort(int arr[]) 
	{
		int n = arr.length; 
		boolean swapped;
		for (int i = 0; i < n-1; i++)  {
			swapped = false;
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j] > arr[j+1]) 
				{ 
					// swap arr[j+1] and arr[j] 
					int temp = arr[j]; 
					arr[j] = arr[j+1]; 
					arr[j+1] = temp; 
					swapped = true;
				} 
				if (swapped == false)
					break;
				for (int n1: arr) {
					System.out.print(n1 + "  ");

				}
				System.out.println();
			}
			System.out.println();}

	}
	public static void insertionSort(int array[]) {  
		int n = array.length;  
		for (int j = 1; j < n; j++) {  
			int key = array[j];  
			int i = j-1;  
			while ( (i > -1) && ( array [i] > key ) ) {  
				array [i+1] = array [i];  
				i--;  

				System.out.println(Arrays.toString(array));
			}  
			array[i+1] = key;  
			System.out.println(Arrays.toString(array));
			System.out.println();

		}  


	}
	public static void selectionSort(int[] arr){  
		for (int i = 0; i < arr.length - 1; i++)  
		{  
			int index = i;  
			for (int j = i + 1; j < arr.length; j++){  
				if (arr[j] < arr[index]){  
					index = j;//searching for lowest index  
				}  
			}  
			int smallerNumber = arr[index];   
			arr[index] = arr[i];  
			arr[i] = smallerNumber;  
		}  
	}  

	public static void printArray(int [][] m ) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m [i][j]+ "\t");

			}
			System.out.println();
		}
	}
		public static void printArray(double [][] m ) {
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					System.out.print(m [i][j]+ "\t");

				}
				System.out.println();
			}
	}
		public static void printArray(String [][] m ) {
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					System.out.print(m [i][j]+ "\t");

				}
				System.out.println();
			}
			
		}
	public static void fillArray(int[][] m) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Type a matrix of ints of " + m.length + "x"+ m[0].length + " ints");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print("m["+i+"]["+j+"]:");
				m[i][j]= sc.nextInt();sc.nextLine();
			}
		}		
		sc.close();
	}


	public static void fillArray(double[][] m) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Type a matrix of " + m.length + "x"+ m[0].length + " doubles");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print("m["+i+"]["+j+"]:");
				m[i][j]= sc.nextDouble();sc.nextLine();
			}
		}
		sc.close();
	}


	public static void fillArray(String[][] m) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Type a matrix of " + m.length + "x"+ m[0].length + " strings");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print("m["+i+"]["+j+"]:");
				m[i][j]= sc.nextLine();
			}
		}
		sc.close();
	}
	public static void fillArrayRandom(int[][] m) {
		Random r= new Random();
		System.out.println("Type a matrix of " + m.length + "x"+ m[0].length + " ints");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				
				m[i][j]= r.nextInt(100);
			}
		}
	}

public static void fillArrayRandom(boolean[][] m) {
		Random r= new Random();
		System.out.println("Type a matrix of " + m.length + "x"+ m[0].length + " ints");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				
				m[i][j]= r.nextBoolean();
			}
		}
	}
	public static void rowchange(int[][] m) {
Scanner sc = new Scanner(System.in);
System.out.print("type the first row: ");
int row1 = sc.nextInt();
System.out.print("type the second row: ");
int row2 = sc.nextInt();
if (row1 >= m.length || row2 >= m.length || row1 < 0 || row2 < 0) {
	System.out.println("the row does not exist");
	
	}else{
			for (int i = 0; i < m[0].length; i++) {
			int temp = m[row1][i];
			m[row1][i] = m[row2][i];
			m[row2][i] = temp;
		}
	



}
sc.close();
	}
}



