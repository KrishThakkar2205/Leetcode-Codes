import java.util.*;
public class Leetcode1122 {
    public static void main(String[] args) {
        Solution1122 s = new Solution1122();
        int arr1[] = {2,3,1,3,2,4,6,7,9,2,19};
        int arr2[] = {2,1,4,3,9,6};
        arr1 = s.relativeSortArray(arr1, arr2);
        for(int x: arr1){
            System.out.println(x);
        }
    }
}
class Solution1122{
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        int [] arr = new int[arr1[arr1.length-1]+1];
        for(int x:arr1){
            arr[x]++;
        }
        int arrpointer = 0;
        for(int x:arr2){
            while(arr[x]>0){
                arr1[arrpointer] = x;
                arrpointer++;
                arr[x]--;
            }
        }
        for(int x = 0; x<arr.length; x++){
            while(arr[x]>0){
                arr1[arrpointer] = x;
                arrpointer++;
                arr[x]--;
            }
        }
        return arr1;
    }
}
