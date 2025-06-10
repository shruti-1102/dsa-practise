import java.util.*;
public class matrix {
    public static int largest(int arr[][]) {
        int lowest = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++) {
            for (int j = 0; j<arr[0].length; j++) {
                if (arr[i][j] > lowest) {
                    lowest = arr[i][j];
                }
            }
        }
        return lowest;
    }
    public static int lowest(int arr[][]) {
        int largest = Integer.MAX_VALUE;
        for (int i = 0; i<arr.length; i++) {
            for (int j = 0; j<arr[0].length; j++) {
                if (arr[i][j] < largest) {
                    largest = arr[i][j];
                }
            }
        }
        return largest;
    }
    public static void printSpiral(int arr[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;
        while(startRow<=endRow && startCol<=endCol) {
            //top
            for (int j = startCol; j<=endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }
            //right
            for (int i = startRow+1; i<=endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            //bottom
            for (int j = endCol-1; j>=startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][j] + " ");
            }
            //left
            for (int i = endRow-1; i>=startRow+1; i--) {
                if (startCol == endCol){
                    break;
                }
                System.out.print(arr[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }
    public static void main (String args[]) {
        // int matrix[][] = new int[3][3];
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the array elements: ");
        // for (int i = 0; i<matrix.length; i++) {
        //     for (int j = 0; j<matrix[0].length; j++) {
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }
        // System.out.println("The largest element in the matrix is: " + largest(matrix));
        // System.out.println("The smallest element in the matrix is: " + lowest(matrix));
        // sc.close();

        int matrix[][] = {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16}};
        printSpiral(matrix);
    }
}
