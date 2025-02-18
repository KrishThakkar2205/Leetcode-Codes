import java.util.*;
public class Leetcode2779 {
    public static void main(String [] args){
        solution2779 s = new solution2779();
        int [] nums = {81,46,85};
        int k = 23;
        System.out.println(s.maximumBeauty(nums, k));
    }
}
class solution2779{
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums); // Sort the array to simplify range checks
        int maxBeauty = 0;
        int start = 0;
        int val = 2 * k;
    
        for (int end = 0; end < nums.length; end++) {
            // Ensure the range between nums[start] and nums[end] is valid
            while (nums[end] - nums[start] > val) {
                start++;
            }
            // Calculate the size of the current valid subarray
            maxBeauty = Math.max(maxBeauty, end - start + 1);
        }
    
        return maxBeauty;
    }
    
}