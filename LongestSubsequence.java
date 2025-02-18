public class LongestSubsequence {
    public static void main(String[] args) {
        int arr[]={0,1,0,3,2,3};
        Solution s=new Solution();
        System.out.println(s.lengthOfLIS(arr));
    }
}
class Solution {
    public int lengthOfLIS(int[] nums) {
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(nums.length - i - 1<=ans){
                return ans;
            }else{
                System.out.print(nums[i]+",");
                ans =Math.max(ans,(CheckLIS(nums, i, nums[i])));
                System.out.println("-->"+ans);

            }
        }
        return ans;
    }
    int CheckLIS(int [] nums , int index ,int prevAdded){
        if(index>=nums.length){
            System.out.print("returned");
            return 1;
        }
        if(index+1<nums.length && nums[index] <= prevAdded ){
            // System.out.print(nums[index]+",");
            return CheckLIS(nums, index+1, prevAdded) + 0;
        }
        else{
            if(index+1<nums.length){

            }
            System.out.print(nums[index]+",");
            return CheckLIS(nums,index + 1,nums[index])+1;
        }
    }
}
