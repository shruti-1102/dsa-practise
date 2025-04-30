public class revise {
    public static int linearSearch(int num[], int tar) {
        for (int i = 0; i<num.length; i++) {
            if (num[i] == tar) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int arr[], int tar) {
        int st = 0;
        int end = arr.length-1;
        for (int i = 0; i<arr.length; i++) {
            int mid = (st + end)/2;
            if (arr[mid] == tar) {
                return mid;
            }
            if (arr[mid]>tar) {
                end = mid-1;
            } else {
                st = mid+1;
            }
        }
        return -1;
    }

    public static void reverseArr(int arr[]) {
        int st = 0; 
        int end = arr.length-1;
        while (st<end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main (String[] args) {
        //LINEAR SEARCH
        int arr1[] = {4, 2, 7, 1, 9, 2};
        int tar1 = 2;
        System.out.println(linearSearch(arr1, tar1));

        //BINARY SEARCH
        int arr2[] = {1, 3, 5, 7, 9, 11};
        int tar2 = 5;
        System.out.println(binarySearch(arr2, tar2));

        //REVERSING AN ARRAY
        int arr3[] = {1, 2, 3, 4, 5};
        reverseArr(arr3);
        printArr(arr3);
    }
}
