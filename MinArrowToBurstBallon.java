import java.util.*;
public class MinArrowToBurstBallon {
    public static void main(String[] args) {
        int [][] points = {
            {3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}
        };
        Solution s1= new Solution();
        System.out.println(s1.findMinArrowShots(points));        
    }
}
class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 1){
            return 1;
        }
        Arrays.sort(points, (arr1, arr2) -> Integer.compare(arr1[1], arr2[1]));
        int temp = points[0][1];
        int arrow=0;
        System.out.println(points[0][0]+" "+points[0][1]);
        for(int i=1;i<points.length;i++){
            System.out.println(points[i][0]+" "+points[i][1]);
            if(temp<points[i][0]){
                arrow++;
                // System.out.println(temp + " "+ points[i][0]+" "+arrow);
                temp=points[i][1];
            }
        }
        return arrow+1;
    }
}
