// import java.util.*;
public class CompareStringFromArr {
    public static void main(String []args){
        String []word1={"a", "cb"};
        String[]word2={"ab", "b"};
        System.out.println(solution_compare.compare(word1, word2));
    }
}
class solution_compare{
    public static boolean compare(String word1[],String word2[]){
        String s1="";
        for(String x:word1){
            s1+=x;
        }
        String s2="";
        for(String x:word2){
            s2+=x;
        }
        return s1.equals(s2);
    }
}
