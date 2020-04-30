package arraypractice;

import java.util.Scanner;

public class TwoDimentionalArrayPractice {
	
	public static void create2DArray(int rowSize, int columnSize) {
		int[][] array = new int[rowSize][columnSize];
		int count = 0;
		for(int i = 0; i < rowSize; i++) {
			for(int j = 0; j < columnSize; j++,count++) {
				array[i][j] = count;
			}
		}
		
		System.out.println("now printing the 2D array...");
		for(int i = 0; i < rowSize; i++) {
			for(int j = 0; j < columnSize; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated met
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter row size for 2D Array...");
		int row = scanner.nextInt();
		System.out.println("Please enter column size for 2D Array...");
		int col = scanner.nextInt();
		scanner.close();
		create2DArray(row,col);
		

	}

}
