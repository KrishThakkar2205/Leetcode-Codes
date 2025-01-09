// import java.util.*;
public class Leetcode2185 {
    public static void main(String[] args) {
        String [] words = {"pay","attention","practice","attend"};
        String pref = "at";
        
        Solution2185 s = new Solution2185();
        System.out.println(s.prefixCount(words, pref));
    }
}

class Solution2185{
    public int prefixCount(String[] words, String pref) {
        int ans = 0;
        int prefixLength = pref.length();
        for(int i = 0; i < words.length; i++){
            if(words[i].length() >= prefixLength && words[i].substring(0, prefixLength).equals(pref)){
                ans++;
            }
        }
        return ans;
    }
}
