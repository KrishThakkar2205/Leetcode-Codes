// import java.util.*;
class longestPallindrome {
    public static void main(String[] args) {
        Solution2  s= new Solution2();
        System.out.println("Solution: "+s.longestPalindrome("babad"));
    }
}
class Solution2 {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        else{
            String ans=""+s.charAt(0);
            System.out.println(ans);
            for(int i=s.length()-1;i>0;i--){
                int left=0;
                int right=left+i;
                while(right<s.length()){
                    // System.out.println(s.substring(left,right));
                    if(s.charAt(left)==s.charAt(right)){
                        String temp="";
                        if(right==s.length()-1){
                            temp=s.substring(left);
                            System.out.println(temp);
                        }else{
                            temp=s.substring(left,right+1);
                            System.out.println(temp);
                        }
                        if(check(temp)){
                            return temp;
                        }
                    }
                    right++;
                    left++;
                }
            }
            return ans;
        }
    }
    boolean check(String temp){
        int left=0;
        int right=temp.length()-1;
        while(left<right){
            if(temp.charAt(left)==temp.charAt(right)){
                left++;
                right--;
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
/*class Solution {
    int start = 0, end = 0;
    public String longestPalindrome(String s) {
        if (s.length() < 2)
            return s;
        char[] c = s.toCharArray();
        longestPallindromeAt(c, 0);
        return s.substring(start, end + 1);
    }
    private void longestPallindromeAt(char[] c, int p) {
        int a = p;
        int b = p;
        int n = c.length;
        if ((p == n - 1 || (n - p) < (end - start + 1)/2))
            return;
        while (b < n - 1 && c[b] == c[b + 1])
            b++;
        p = b;
        while (a > 0 && b < n - 1 && c[a - 1] == c[b + 1])
        {
            a--;
            b++;
        }
        if ((b - a) > (end - start))
        {
            end = b;
            start = a;
        }
        longestPallindromeAt(c, p + 1);
    }
} */