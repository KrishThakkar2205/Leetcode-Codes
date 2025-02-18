import java.util.*;
public class Sum3Close {
    public static void main(String[] args) {
        int nums[]={4,0,5,-5,3,3,0,-4,-5};
        System.out.println(Solution.threeSumClosest(nums,-2));
    }
}
class Solution {
    public static int threeSumClosest(int[] nums, int target) {
           if(nums.length==3){
               return nums[0]+nums[1]+nums[2];
           }
           Arrays.sort(nums);
            int Assumed =nums[0]+nums[1]+nums[2];
            for(int i=0;i<nums.length;i++){
                int left= i+1;
                int right=nums.length-1;
                while(left<right){
                    if(nums[i]+nums[left]+nums[right]==target){
                        return nums[i]+nums[left]+nums[right];
                    }
                    else if(nums[i]+nums[left]+nums[right]<target){
                        if(Math.abs(nums[i]+nums[left]+nums[right]-target)<Math.abs(target-Assumed)){
                            Assumed=nums[i]+nums[left]+nums[right];
                        }
                        // Assumed=nums[i]+nums[left]+nums[right];
                        left++;
                    }
                    else if(nums[i]+nums[left]+nums[right]>target){
                        if(Math.abs(nums[i]+nums[left]+nums[right]-target)<Math.abs(target-Assumed)){
                            Assumed=nums[i]+nums[left]+nums[right];
                        }
                        // Assumed=nums[i]+nums[left]+nums[right];
                        right--;
                    }
                    else{
                        right--;
                        left++;
                    }
                }
                while(i<nums.length-1){
                    if(nums[i]==nums[i+1]){
                        i++;
                    }
                    else{
                        break;
                    }
                }
            }
            return Assumed;
        }
}