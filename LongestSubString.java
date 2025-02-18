public class LongestSubString {
    public static void main(String args[]){

    }
}
class lengthOfSubString {
     int lengthOfLongestSubstring(String s) {
        /*int n = s.length();
        int max = 0;
        int i = 0, j = 0;
        HashSet<Character> set = new HashSet();

        while (j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                max = Math.max(max, j - i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return max;*/
        /* int max = 0;
         for (int i = 0; i < s.length(); i++)
            for (int j = i + 1; j <= s.length(); j++){
                if(s.substring(i,j).length() <= max)
                    continue;
                if(isIsogram(s.substring(i,j)) && s.substring(i,j).length() > max)
                    max = s.substring(i,j).length();
            }
        return max;
       
    }
    public boolean isIsogram(String str) {
        if (str == null)
            return true;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < str.length(); i++){
            if(set.contains(str.charAt(i)))
                return false;
            set.add(str.charAt(i));
        }
        return true;*/
        int n = s.length();
        int[] lastIndex = new int[128]; // Assuming ASCII characters

        int start = 0;
        int maxLength = 0;

        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            start = Math.max(lastIndex[currentChar], start);
            maxLength = Math.max(maxLength, end - start + 1);
            lastIndex[currentChar] = end + 1;
        }

        return maxLength;
    }
}