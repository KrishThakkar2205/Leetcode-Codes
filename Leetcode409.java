public class Leetcode409 {
    public static void main(String[] args) {
        Solution409 sol = new Solution409();
        String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        System.out.println(sol.longestPalindrome(s));
    }
}
class Solution409{
    public int longestPalindrome(String s) {
        if(s.length() == 1){
            return 1;
        }
        char [] ch = s.toCharArray();
        int [] arr = new int[58];
        for(char c:ch){
            arr[c-'A']++;
        }
        int max = -1;
        int ans = 0;
        for( int i = 0; i< arr.length ; i++ ){
            if(arr[i]%2 == 0){
                ans += arr[i];
            } else {
                if(max<arr[i]){
                    if(max != -1){
                        ans += arr[max] - 1;
                    }
                    max = i;
                } else {
                    ans += arr[i] -1;
                }
            }
        }
        return (max==-1)?( ans ):(ans + arr[max]);
    }
}
