
import java.util.*;
public class Leetcode78 {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        Solution s = new Solution();
        System.out.println(s.subsets(nums));
    }
}
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subset = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        subset.add(set);
        Backtrack(nums, 0, subset, new ArrayList<>());

        return subset;
    }
    private void Backtrack(int [] nums,int prev,List<List<Integer>> subset,List<Integer> set){
        // [1,2,3]
        
            for(int j = prev; j<nums.length; j++){
                set.add(nums[j]);
                // List <Integer> fix = new ArrayList<>(set);
                subset.add(set);
                Backtrack(nums, j+1, subset, set);
                // set = new ArrayList<>();
            }
        
    }
}
