package arrays;

import java.util.Arrays;

public class Task9_7 {

	public static void main(String[] args) {
//Write a program that increases the value of each array element by one. 
		int[]v=new int[3];
		
		 ArraysM.fillArray(v);
     for (int i = 0; i < v.length; i++) {
    	
    	 v[i]++;
    	

	}
     System.out.println(Arrays.toString(v));
	}
     
     //System.out.println(Arrays.toString(v));
     
     
	}


