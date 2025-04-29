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

    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i<prices.length; i++) {
            if (buyPrice < prices[i]) { //profit
                int profit = prices[i] - buyPrice; //today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static int trappedRainwater(int height[]) {
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i<height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for (int i = height.length-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        int trappedWater = 0;
        for (int i = 0; i<height.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater = trappedWater + (waterLevel - height[i]);
        }
        return trappedWater;
    }

    public List<List<Integer>> threeSum(int nums[]) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i<nums.length; i++) {
            for (int j = i+1; j<nums.length; j++) {
                for (int k = j+1; k<nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
        return result;
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

        //buy and sell stocks problem!
        //finding maximum profit from the prices array of stocks. return 0 if no profit can be achieved.
        int prices[] = {7, 1, 5, 3, 6, 4};
        //2 questions of dsa sheet done.
        System.out.println(buyAndSellStocks(prices));

        //given integers in array representing elevation, width of each is 1. find trapped rainwater.
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappedRainwater(height));

        //given array of numbers, return triplets whose sum is 0 but they're no duplicate.
        dsasheet6 obj = new dsasheet6();
        int numbers[] = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = obj.threeSum(numbers);
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }


        //DSA SHEET #6 COMPLETE!!

        
    }
}


