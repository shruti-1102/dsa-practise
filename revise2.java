import java.util.*;

public class revise2 {
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printarr(arr);
    }
    public static void printarr(int arr[]) {
        for (int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers in your array: ");
        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
    }
}
