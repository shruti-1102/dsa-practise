public class dsasheet7 {
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i<arr.length-1; i++) {
            for (int j = 0; j<arr.length-1; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int arr[]) {
        for (int i = 0; i<arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j<arr.length-1; j++) {
                if (arr[j] > arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void insertionSort(int arr[]) {
        for (int i = 1; i<arr.length; i++) {
            int curr = arr[i];
            int j = i-1;
            while (j>0 && arr[j] < curr) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
    }
    public static void countingSort(int arr[]) {
        if (arr.length == 0) return;
    
        int lar = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lar = Math.max(lar, arr[i]);
        }
    
        int count[] = new int[lar + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
    
        int ind = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i]-- > 0) {
                arr[ind++] = i;
            }
        }
    }    
    public static void printArr(int arr[]) {
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main (String args[]) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1}; //sort in descending order
        bubbleSort(arr);
        printArr(arr);

        selectionSort(arr);
        printArr(arr);

        insertionSort(arr);
        printArr(arr);

        countingSort(arr);
        printArr(arr);
    }
}
