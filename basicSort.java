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
    public static void main (String[] args) {
        int nums[] = {5, 4, 1, 3, 2};
        bubbleSort(nums);
        printArr(nums);

        int num[] = {4, 1, 6, 2, 3};
        reverseBubbleSort(num);
        printArr(num);
    }
}