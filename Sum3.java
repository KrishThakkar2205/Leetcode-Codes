import  java.util.*;
public class Sum3 {
    public static void main(String[] args) {
        int nums[]={1,0,-1,2,0,-2,-1,4,-2};
        find.threeSum(nums);
    }
}
class find {
    public static  void threeSum(int[] nums) {
       Arrays.sort(nums);
        List <List<Integer>> l=new ArrayList<>();
        HashSet<List<Integer>> h= new HashSet<>();
        for(int i=0;nums[i]<=0&&i<nums.length;i++)
        {
            int neededAns=-nums[i];
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                if(nums[left]+nums[right]>neededAns)
                {
                    right--;
                    
                }
                else if(nums[left]+nums[right]<neededAns){
                    left++;
                }
                else if(nums[left]+nums[right]==neededAns){
                    List<Integer> l1=new ArrayList<>();
                    l1.add(nums[left]);
                    l1.add(nums[right]);
                    l1.add(nums[i]);
                    // Collections.sort(l1);
                    boolean flg=h.add(l1);
                    if(flg==true)
                    {
                        l.add(l1);
                    }
                    left++;
                    // right=nums.length-1;
                }
            }
        }
        System.out.println(l);
      }
    }