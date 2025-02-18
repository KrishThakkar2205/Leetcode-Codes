// import java.util.*;
public class CustomSort {
    public static void main (String [] args){
        Solution sol = new Solution();
        System.out.print(sol.customSortString("kqep", "pekeq"));
    }
}
class Solution {
    public String customSortString(String order, String s) {
        
        
        int [] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }

        StringBuffer ans = new StringBuffer(); 

        for(char ch : order.toCharArray()){
            while(freq[ch-'a']>0){
                ans.append(ch);
                freq[ch-'a']--;   
            }
        }

        for(int i=0; i<freq.length; i++){
            while(freq[i]>0){
                ans.append((char)(i+'a'));
                freq[i]--;
            }
        }

        return ans.toString();

    }
}
