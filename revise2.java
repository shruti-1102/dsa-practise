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
        // printarr(arr);
    }

    public static void selectionSort(int arr[]) {
        int swap = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int minInd = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minInd]) {
                    minInd = j;
                }
            }
            if (minInd != i) {
                int temp = arr[i];
                arr[i] = arr[minInd];
                arr[minInd] = temp;
                swap++;
            }
        }
        System.out.println();
        printarr(arr, swap);
    }

    public static void printarr(int arr[], int swap) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Total swaps: " + swap);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers in your array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // bubbleSort(arr);
        selectionSort(arr);

        sc.close();
    }
}
