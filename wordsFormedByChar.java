import java.util.*;
public class wordsFormedByChar {
    public static void main(String[] args) {
        Solution s=new Solution();
        String[] arr={"krish","shlok"};
        s.countCharacters(arr,"krish");
    }
}
class Solution {
    public int countCharacters(String[] words, String chars) {
        int length=0;
        HashMap <Character,Integer> Chars= new HashMap <Character,Integer> ();
        for(int i=0;i<chars.length();i++){
            if (Chars.containsKey(chars.charAt(i))) {
                int ferq=Chars.get(chars.charAt(i));
                Chars.put(chars.charAt(i),++ferq);
            }
            else{
                Chars.put(chars.charAt(i),1);
            }
        }
        for(int i=0;i<words.length;i++){
            boolean flg=true;
            HashMap <Character,Integer> temp= new HashMap <Character,Integer> (Chars);
            for(int j=0;i<words[i].length();j++){
                if(temp.containsKey(words[i].charAt(j))){
                    int freq=temp.get(words[i].charAt(j))-1;
                    if(freq==0){
                        temp.remove(words[i].charAt(j));
                    }
                    temp.put(words[i].charAt(j), freq);
                }else{
                    flg=false;
                    break;
                }
            }
            System.out.println(temp);
            if(flg){
                length+=words[i].length();
            }
        }
        return length;
    }
}
