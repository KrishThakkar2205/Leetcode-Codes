import java.util.Arrays;

public class nextPermutation {
    public static void main(String[] args) {
        int nums[]={1,2,3};
        Solution.nextPermutation2(nums);
        System.out.println(Arrays.toString(nums));
    }
}
class Solution {
    public static void nextPermutation2(int[] nums) {
        // Step 1: Find the first element from the right that is smaller than its right neighbor
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: If such an element exists, find the smallest element to the right of i, but greater than nums[i]
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // Step 3: Reverse the elements to the right of i
        reverse(nums, i + 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}

