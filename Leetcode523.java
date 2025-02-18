public class Leetcode523 {
    public static void main(String[] args) {
        int [] nums = {5,0,0,0};
        int k = 3;
        Solution523 s =new Solution523();
        System.out.println(s.checkSubarraySum(nums, k));
    }
}
class Solution523{
    public boolean checkSubarraySum(int[] nums, int k) {
        int[] presum = new int[nums.length];
        presum[0] = nums[0];

        for(int i = 1; i < nums.length; i++)
            presum[i]  = presum[i-1] + nums[i];
        
        for(int i = 0; i < nums.length; i++){
            // System.out.print(presum[i]);
            if(presum[i]%k == 0){
                return true;
            }
        }

        for(int i = 0; i<nums.length; i++){
            for(int j = i; j<nums.length; j++){
                presum[j] -= nums[i];
                // System.out.print(presum[j]);
            }
            
            for(int j = i+1; j<nums.length; j++){
                // 
                if(presum[j]%k == 0 || presum[j]==0){return true;}
            }
        }
        return false;
    }
}
