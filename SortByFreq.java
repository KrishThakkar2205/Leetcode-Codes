import java.util.*;
public class SortByFreq {
    public static void main(String[] args) {
        String s="tree";
        
        HashMap <Character,Integer> hash = new HashMap<>();
        for(char ch:s.toCharArray()){
            hash.compute(ch,(k,v) -> (v == null) ? 1: v+1);
        }
        PriorityQueue <Character> p= new PriorityQueue<>((a,b) -> hash.get(b)-hash.get(a));

        for(char ch:s.toCharArray()){
            if (!p.contains(ch)){
                p.add(ch);
            }
        }
        // System.out.println(p);
        String ans="";
        while(!p.isEmpty()){
            char ch=p.poll();
            ans+=String.valueOf(ch).repeat(hash.get(ch));
        }

        System.out.println(ans);
    }
}
class sortFreq{
    
}