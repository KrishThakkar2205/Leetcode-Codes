import java.util.*;
class Try{
    public static void main(String[] args) {
        String []arr={"caaaaa","aaaaaaaaa","a","bbb","bbbbbbbbb","bbb","cc","cccccccccccc","ccccccc","ccccccc","cc","cccc","c","cccccccc","c"};
        System.out.println(Solution.makeEqual(arr));
    }
}
class Solution {
    public  static boolean makeEqual(String[] words) {
        if(words.length==1){
            return true;
        }
        int n=words.length;
        ArrayList<Character> arr=new ArrayList();
        HashMap <Character,Integer> h=new HashMap();
        for(int i=0;i<n;i++){
            for(char x:words[i].toCharArray()){
                if(h.containsKey(x)){
                    h.put(x,h.get(x)+1);
                }
                else{
                    arr.add(x);
                    h.put(x,1);
                }
            }
        }
        
        for(int i=1;i<arr.size();i++){
            int x=h.get(arr.get(i));
            
            if(n>x || x%n!=0){
                return false;
            }
             
        }
        return true;
    }
}