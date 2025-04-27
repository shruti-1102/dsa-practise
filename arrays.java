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
    public static void main (String[] args) {
        int nums[] = {-5, -2, 0, 3, 4, 7, 10};
        int target = 9;
        System.out.println(binSearch(nums, target));
    }
}