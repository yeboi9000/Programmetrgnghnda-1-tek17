package arrays;

import java.util.Arrays;

public class Array4 {
	public static void main(String[] args) {
		{

			int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };

			System.out.println("Originalla nummer : " + Arrays.toString(my_array1));
			Arrays.sort(my_array1);
			System.out.println("sorterad: " + Arrays.toString(my_array1));
            
		}
	}
}
