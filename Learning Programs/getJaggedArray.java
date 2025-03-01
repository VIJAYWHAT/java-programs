import java.util.Scanner;

public class getJaggedArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of sub-arrays: ");
		int numberOfArrays = scan.nextInt();
		
		int[][] jaggedArray = new int[numberOfArrays][];
		
		for (int i = 0; i < numberOfArrays; i++) {
			System.out.print("Enter the size of sub-array " + (i + 1) + ": ");
			int sizeOfSubArray = scan.nextInt();
			jaggedArray[i] = new int[sizeOfSubArray];
		}
		
		for (int i = 0; i < numberOfArrays; i++) {
			System.out.println("Enter the elements of sub-array " + (i + 1) + ":");
			for (int j = 0; j < jaggedArray[i].length; j++) {
				jaggedArray[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("The jagged array is:");
		for (int i = 0; i < numberOfArrays; i++) {
			for (int j = 0; j < jaggedArray[i].length; j++) {
				System.out.print(jaggedArray[i][j] + " ");
			}
			System.out.println();
		}
		
		scan.close();
	}
}
