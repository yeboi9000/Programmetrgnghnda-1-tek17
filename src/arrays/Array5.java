package arrays;

import java.util.Arrays;

public class Array5 {

	public static boolean contains(int[] arr, int item) {
		for (int n : arr) {
          if (item == n)
		    return true;
        	  
		}
		
		return false;
	} 
	public static void main(String [] args) {
		int [] episkarray = {
				1234,1244,5767,3325,8787};
				
				System.out.println(contains(episkarray, 1234));
				System.out.println(contains(episkarray, 1254));
		}
	}
		

