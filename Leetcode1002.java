import java.util.*;

public class Leetcode1002 {
    public static void main(String[] args) {
        String[] words = { "acabcddd", "bcbdbcbd", "baddbadb", "cbdddcac", "aacbcccd", "ccccddda", "cababaab",
                "addcaccd" };
        Solution1002 sol = new Solution1002();
        System.out.println(sol.commonChars(words));
    }
}

class Solution1002 {
    public List<String> commonChars(String[] words) {
        // Filling the array common with max possible frequency
        int [] common = new int[26];
        Arrays.fill(common,101);
        
        for(String word : words){
            int [] arr = new int [26];
            
            for(char ch : word.toCharArray())
                arr[ch-'a']++;
            
            for(int i = 0; i<26 ;i++){
                common[i] = Math.min(arr[i],common[i]);
            }
        }

        List<String> ans = new ArrayList<String>();
        for( int i = 0; i < common.length ; i++ )
            while(common[i]>0){
                ans.add((char)(i+'a')+"");
                common[i]--;
            }

        return ans;
    }
}
