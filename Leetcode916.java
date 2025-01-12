import java.util.*;
public class Leetcode916 {
    public static void main(String[] args) {
        String [] words1 = {"amazon","apple","facebook","google","leetcode"};
        String [] words2 = {"lo","eo"};
        Solution916 s = new Solution916();
        System.out.println(s.wordSubsets(words1, words2));
    }
}

class Solution916{
    
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<String>();

        // // The Code Below will get the count of all Characters in Array 'words2'
        // HashMap<String, int []> index = new HashMap<String, int []>();
        // for(String words : words2){
        //     int [] charCount = new int[26];
        //     for(char c : words.toCharArray()){
        //         charCount[c-'a']++;
        //     }
        //     index.put(words,charCount);
        // }

        // for(String word : words1){
        //     int [] charCountOfWords1 = new int[26];

        //     for(char c : word.toCharArray()){
        //         charCountOfWords1[c-'a']++;
        //     }
        //     boolean flg = true;
        //     for(String words : words2){
        //         int [] charCount = index.get(words);
                
        //         for(int i =0; i<26; i++ ){
        //             if(charCount[i] > charCountOfWords1[i]){
        //                 flg = false;
        //                 break;
        //             }
        //         }
        //         if(!flg) break; 
        //         else continue;
        //     } 
        //     if (flg) ans.add(word);

        // }
        // return ans; 
        // bruteforce approach;
        
        int maxCharInWords2 [] = new int[26];
        int tempCharInWords2 [] = new int[26];
        for(String word : words2){
            Arrays.fill(tempCharInWords2,0);
            for(char ch : word.toCharArray()){
                tempCharInWords2[ch-'a']++;
            }
            for(int i = 0; i<26; i++){
                maxCharInWords2[i] = Math.max(maxCharInWords2[i], tempCharInWords2[i]);
            }
        }

        for(String word : words1){
            Arrays.fill(tempCharInWords2,0);
            for(char ch : word.toCharArray()){
                tempCharInWords2[ch-'a']++;
            }
            boolean flg = true;
            for(int i = 0; i < 26; i++){
                if(maxCharInWords2[i] > tempCharInWords2[i]){
                    flg = false; 
                    break;
                }
            }
            if(flg){
                ans.add(word);
            }
        }

        return ans;

    }
}