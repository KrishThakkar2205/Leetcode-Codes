/**
 * Problem 2486 : Append Character to String to make Subsequence
 */
public class Leetcode2486 {
    public static void main(String[] args) {
        String s = "coaching", t = "coding";
        Solution2486 sol = new Solution2486();
        int ans = sol.appendCharacters(s,t);
        System.out.println(ans);
    }
}
class Solution2486 {
    public int appendCharacters(String s, String t) {
        char [] chs = s.toCharArray();
        char [] cht = t.toCharArray();
        int spoint = 0;
        int tpoint = 0;
        while(spoint < chs.length && tpoint < cht.length){
            if(chs[spoint] == cht[tpoint]){
                spoint++;
                tpoint++;
            } else {
                spoint++;
            }
        } 
        if(tpoint < cht.length - 1){
            return cht.length - tpoint;
        } else {
            return 0;
        }    
    }    
}
