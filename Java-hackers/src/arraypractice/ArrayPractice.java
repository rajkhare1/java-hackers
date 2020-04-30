package arraypractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayPractice {
	
	static Random rand = new Random();
	
	public static <T> void printArray(T[] array) {
		for(T element : array) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration, Allocation, Initialization
		Integer[] intArray1;
		Integer[] intArray2 = new Integer[4];
		printArray(intArray2);
		Integer[] intArray3 = {5, 2, 9, 1, 3};
		
		String[] shoppingList = {"bananas", "apples", "pears"};
		
		intArray2[0] = 10;
		intArray2[1] = 8;
		intArray2[2] = 5;
		intArray2[3] = 10;
		
		
		// print out Arrays
		System.out.println(Arrays.toString(intArray2));
		System.out.println(Arrays.toString(intArray3));
		System.out.println();
		
		
		
		// Custom print out Arrays
		printArray(intArray2);
		printArray(intArray3);
		System.out.println();
		
		// Retrieve Objects
		System.out.println(intArray2[3]);
		System.out.println(Array.get(intArray2, 3));
		System.out.println();
		
		// Given functions
		Arrays.sort(intArray3);
		printArray(intArray3);
		System.out.println();
		
		// Print String array
		printArray(shoppingList);
		System.out.println();
		
		// Special for loop: foreach
		for(String list : shoppingList) {
			System.out.println(list);
		}
		System.out.println();
		
		// print random value from an array
		System.out.println(shoppingList[Math.abs(rand.nextInt()) % shoppingList.length]);

	}

}
