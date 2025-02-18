// import java.util.*;
public class Leetcode344 {
    public static void main(String[] args) {
        Solution344 sol = new Solution344();
        char [] s = {'h','e','l','l','o'};
        sol.reverseString(s);
        for(char ch : s){
            System.out.print(ch+" ");
        }
    }
}
class Solution344 {
    public void reverseString(char[] s) {
        int right = s.length - 1;
        int left = 0;
        while(left<right){
            s[left] = (char)(s[left] + s[right]);
            s[right] = (char)(s[left] - s[right]);
            s[left] = (char)(s[left] - s[right]);
            left++;
            right--;
        }
    }
}
