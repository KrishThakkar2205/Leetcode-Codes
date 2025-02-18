import java.util.*;

public class Leetcode648 {
    public static void main(String[] args) {
        String[] dict = { "a", "b", "c" }; // bat cat rat
        List<String> dictionary = Arrays.asList(dict);
        String sentence = "aadsfasf absbs bbab cadsfafs";
        Solution648 s = new Solution648();
        System.out.println(System.currentTimeMillis());
        System.out.println(s.replaceWords(dictionary, sentence));
        System.out.println(System.currentTimeMillis());
    }
}

class Solution648 {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] dict = new String[dictionary.size()];
        for (int i = 0; i < dictionary.size(); i++) {
            dict[i] = dictionary.get(i);
        }
        String[] sent = sentence.split(" ");
        Arrays.sort(dict, (String a, String b) -> Integer.compare(a.length(), b.length()));
        for (int i = 0; i < sent.length; i++) {
            for (String s : dict) {
                if (sent[i].length() > s.length() && sent[i].substring(0, s.length()).equals(s)) {
                    sent[i] = s;
                    break;
                }
            }
        }
        // for (String s : dict)
        StringBuffer s = new StringBuffer();
        for (String i : sent) {
            s.append(i + " ");
        }
        return s.substring(0, s.length() - 1).toString();
    }
}
