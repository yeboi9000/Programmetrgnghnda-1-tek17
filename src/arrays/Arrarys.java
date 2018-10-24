package arrays;

import java.util.ArrayList;
import java.util.*;
public class Arrarys {

	public static void main(String[] args) {
		
		// array
		
		
		int [] intarray = new int[5];
		System.out.println(intarray[0]); 
		intarray[0] = 215;
		intarray[1] = 548;
		intarray[2] = 4537;
		intarray[3] = 458;
		System.out.println(intarray[0]); 
		System.out.println(intarray[1]); 
		
		int[] intarray2 = { 215, 548, 4547, 458 };
		System.out.println(intarray[0]); 
		System.out.println(intarray[1]); 
		
		System.out.println("Length " + intarray2.length);
		// array list 
		
		ArrayList arrayList = new ArrayList();
		arrayList.add(123);
		arrayList.add(124);
		arrayList.add(134);
		arrayList.add(123);
		arrayList.add(124);
		arrayList.add(134);
		arrayList.add(124);
		arrayList.add(134);
		System.out.println("Size " +arrayList.size());
		System.out.println( "Get " + arrayList.get(0));
		
		for (int i = 0; i < arrayList.size(); i++) {
		System.out.println("Loop(Index:" + i + ", Value" + arrayList.get(i) + ")");
	} 
		for (int i = 0; i < intarray.length; i++); 
				
		
				System.out.println("Loop Array(Index: " + i + ", Value " + intarray[i] + ")");
		 System.out.println(arrayList.toString());
	}

}
	

