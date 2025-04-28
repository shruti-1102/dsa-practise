//dsa sheet #6 from the course.
import java.util.*;

public class dsasheet6 {
    public static boolean isPresent(int nums[]) {
        for (int i = 0; i<nums.length; i++) {
            for (int j = 0; j<nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static int binSerRotArray(int num[], int tar) {
        int st = 0;
        int end = num.length-1;
        while (st <= end) {
            int mid = st + (end - st)/2;
            if (num[mid] == tar) {
                return mid;
            }
            if (num[st] <= num[mid]) { //left sorted
                if (num[st] <= tar && tar <= num[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else { //right sorted
                if (num[mid] <= tar && tar <= num[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static int minInRotArray(int num[]) {
        int st = 0;
        int end = num.length-1;
        while (st < end) {
            int mid = st + (end - st)/2;
            if (num[mid] > num[end]) {
                st = mid + 1;
            } else {
                end = mid;
            }
        }
        return num[st];
    }
    public static int tarInRotArray(int num[], int tar) {
        int st = 0;
        int end = num.length-1;
        while (st <= end) {
            int mid = st + (end - st)/2;
            if (num[mid] == tar) {
                return mid;
            }
            if (num[st] <= num[mid]) { //left sorted
                if (num[st] <= tar && tar <= num[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else { //right sorted
                if (num[mid] <= tar && tar <= num[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main (String[] args) {
        //return true if duplicate values present. else return false.
        int nums[] = {1, 2, 3, 1};
        System.out.println(isPresent(nums));

        //return index of target if present or -1 if not in a sorted rotated array.
        int num[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 1;
        System.out.println(binSerRotArray(num, target));
        //finding minimum element in rotated sorted array.
        System.out.println(minInRotArray(num));
        //returning index of target element in the rotated sorted array if present, else, returning -1.
        System.out.println(tarInRotArray(num, target));

        
        //2 questions of dsa sheet done.
    }
}


