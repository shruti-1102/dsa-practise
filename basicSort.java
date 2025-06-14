public class basicSort {
    public static void bubbleSort(int nums[]) {
        int swaps = 0;
        for (int turn = 0; turn<nums.length-1; turn++) {
            for (int j = 0; j<nums.length-1-turn; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swaps++;
                }
            }
        }
        System.out.println("Swap count: " + swaps);
    }
    
    public static void printArr(int arr[]) {
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverseBubbleSort(int nums[]) {
        for (int turn = 0; turn<nums.length-1; turn++) {
            for (int j = 0; j<nums.length-1-turn; j++) {
                if (nums[j]<nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int nums[]) {
        for (int i = 0; i<nums.length-1; i++) {
            int minPos = i;
            for (int j = i+1; j<nums.length; j++) {
                if (nums[minPos] > nums[j]) {
                    minPos = j;
                }
            }
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
    }

    public static void reversedSelectionSort(int num[]) {
        for (int i = 0; i<num.length-1; i++) {
            int minPos = i;
            for (int j = i+1; j<num.length; j++) {
                if (num[minPos] < num[j]) {
                    minPos = j;
                }
            }
            int temp = num[minPos];
            num[minPos] = num[i];
            num[i] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            //finding correct pos to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev + 1] = curr;
        }
    }
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i<arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i<count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main (String[] args) {
        int nums[] = {5, 4, 1, 3, 2};
        bubbleSort(nums);
        printArr(nums);

        int num[] = {4, 1, 6, 2, 1, 4, 3};
        reverseBubbleSort(num);
        printArr(num);

        selectionSort(nums);
        printArr(nums);

        reversedSelectionSort(nums);
        printArr(nums);

        insertionSort(num);
        printArr(num);

        countingSort(num);
        printArr(num);
    }
}