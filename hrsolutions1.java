import java.util.*;

public class hrsolutions1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i<=10; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }

        //taking input of length of array and then the array values and storing them in the array
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        //Given a 6×6 2D integer array, you need to find the maximum hourglass sum in the array.
        int arr2[][] = new int[6][6];
        System.out.println("Enter the values in the matrix.");
        for (int i = 0; i<6; i++) {
            for (int j = 0; j<6; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i<=3; i++) {
            for (int j = 0; j<=3; j++) {
                int sum = arr2[i][j] + arr2[i][j+1] + arr2[i][j+2] + arr2[i+1][j+1] + arr2[i+2][j] + arr2[i+2][j+1] + arr2[i+2][j+2];
                maxSum = Math.max(sum, maxSum);
            }
        }
        System.out.println("The max sum of hourglass in the given matrix is: " + maxSum);



        sc.close();
    }
}
