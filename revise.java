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

    public static void subArrayOfArray(int arr[]) {
        for (int i = 0; i<arr.length; i++) {
            for (int j = i; j<arr.length; j++) {
                for (int k = i; k<=j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void bruteForce(int arr[], int tar) {
        for (int i = 0; i<arr.length; i++) {
            for (int j = i+1; j<arr.length; j++) {
                if (arr[i] + arr[j] == tar) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }

    public static int prefixSum(int arr[], int L, int R) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i<arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        if (L == 0) {
            return prefix[R];
        } else {
            return prefix[R] - prefix[L-1];
        }
    }

    public static int maxSubarraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i<arr.length; i++) {
            currSum+=arr[i];
            if (currSum<0) {
                currSum = 0;
            }
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        return maxSum;
    }

    public static int trappingRainwater(int arr[]) {
        int n = arr.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
    
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }
    
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }
    
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - arr[i];
        }
    
        return trappedWater;
    }

    public static int binSerRotArr(int arr[], int tar) {
        int st = 0;
        int end = arr.length-1;
        while (st <= end) {
            int mid = st + (end - st)/2;
            if (arr[mid] == tar) {
                return mid;
            }
            if (arr[st] <= arr[mid]) { //left sorted
                if (arr[st] <= tar && tar <= arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else { //right sorted
                if (arr[mid] <= tar && tar <= arr[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int buySellStocks(int arr[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i<arr.length; i++) {
            int currPrice = arr[i];
            if (buyPrice < currPrice) {
                int profit = currPrice - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = currPrice;
            }
        }
        return maxProfit;
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i< arr.length; i++) {
            for (int j = 0; j<arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            printArr(arr);
        }
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i<arr.length-1; i++) {
            int minPos = i;
            for (int j = i+1; j<arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
            printArr(arr);
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
        System.out.println();

        //BINARY SEARCH
        int arr2[] = {1, 3, 5, 7, 9, 11};
        int tar2 = 5;
        System.out.println(binarySearch(arr2, tar2));
        System.out.println();

        //REVERSING AN ARRAY
        int arr3[] = {1, 2, 3, 4, 5};
        reverseArr(arr3);
        printArr(arr3);
        System.out.println();

        //SUBARRAY OF AN ARRAY
        int arr4[] = {1, 2, 3};
        subArrayOfArray(arr4);
        System.out.println();

        //BRUTE FORCE
        int arr5[] = {2, 4, 3, 5, 7, 8, 9};
        int tar3 = 7;
        bruteForce(arr5, tar3);
        System.out.println();

        //PREFIX SUM
        int arr6[] = {2, 4, 1, 7, 9, 3};
        int L = 2, R = 4;
        System.out.println(prefixSum(arr6, L, R));
        System.out.println();

        //KADANE'S ALGORITHM
        int arr7[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubarraySum(arr7));
        System.out.println();

        //TRAPPING RAINWATER
        int arr8[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappingRainwater(arr8));
        System.out.println();

        //BINARY SEARCH IN ROTATED SORTED ARRAY
        int arr9[] = {4,5,6,7,0,1,2};
        int tar4 = 0;
        System.out.println(binSerRotArr(arr9, tar4));
        System.out.println();

        //BUY AND SELL STOCKS PROBLEM
        int arr10[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buySellStocks(arr10));
        System.out.println();

        //BUBBLE SORT
        int arr11[] = {5, 1, 4, 2, 8};
        bubbleSort(arr11);
        System.out.println();

        //SELECTION SORT
        int arr12[] = {64, 25, 12, 22, 11};
        selectionSort(arr12);
    }
}
