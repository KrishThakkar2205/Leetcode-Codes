import java.util.*;
public class Leetcode1408{
    public static void main(String [] args){
        String words [] = {"mass","as","hero","superhero"};
        Sloution1408 s = new Sloution1408();
        List<String> ans = s.stringMatching(words);
        System.out.println(ans);
    }
}

class Sloution1408{
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<String>();
        Arrays.sort(words, Comparator.comparingInt(String::length));
        for(int i = 0; i < words.length; i++){
            for(int j = i+1; j < words.length; j++){
                if(words[j].contains(words[i])){ 
                    ans.add(words[i]); 
                    break;
                } else {
                    continue;
                }
            }
        }
        return ans;
    }
}