public class arrays {
    public static int binSearch (int nums[], int target) {
        int start = 0;
        int end = nums.length-1;
        while (start <= end) {
            int mid = (start + end)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (mid>target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }

    public static int minInArray (int nums[]) {
        int low = 0;
        int high = nums.length-1;
        while (low<high) {
            int mid = (low + high)/2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }

    public static int maxInArray (int nums[]) {
        int low = 0;
        int high = nums.length-1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] <  nums[high]) {
                high = mid - 1;
            } else {
                low = mid;
            }
        }
        return nums[high];
    }
    public static void main (String[] args) {
        //using basic binary search
        // int nums[] = {-5, -2, 0, 3, 4, 7, 10};
        // int target = 9;
        // System.out.println(binSearch(nums, target));

        //finding the minimum element in the rotated sorted array
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        // System.out.println(minInArray(nums));
        System.out.println(maxInArray(nums));
    }
}