import java.util.*;
public class Sum4 {
    public static void main(String[] args) {
        int nums[]={1000000000, 1000000000, 1000000000, 1000000000};
        Solution.fourSum(nums, -294967296);
        // for(int i=0;i<nums.length;i++){
        //     System.out.println(nums[i]);
        // }
    }    
}

class Solution {
    public static void fourSum(int[] nums, int target) {
        List<List<Integer>> l= new ArrayList<List<Integer>>();
        HashSet<List<Integer>> h= new HashSet<List<Integer>>();
        Arrays.sort(nums);
        int i,j;
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                // int search=target-nums[i]-nums[j];
                int left=j+1;
                int right=nums.length-1;
                while(left<right){
                    if((double)nums[i]+(double)nums[j]+(double)nums[left]+(double)nums[right]==target){
                        List<Integer> l1= new ArrayList<Integer>();
                        l1.add(nums[i]);
                        l1.add(nums[j]);
                        l1.add(nums[left]);
                        l1.add(nums[right]);
                        if(h.add(l1)){
                            l.add(l1);
                        }
                        left++;
                    }
                    else if(nums[i]+nums[j]+nums[left]+nums[right]<target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
                
            }
        }
       System.out.println(l);
    }
}