public class Leetcode3110 {
    public static void main(String[] args) {
        String s = "zaz";
        Leetcode3110Sol sol = new Leetcode3110Sol();
        System.out.println(sol.scoreOfString(s));
    }
}
class Leetcode3110Sol{
    public int scoreOfString(String s) {
        int len =s.length();
        if(len == 2){
            return Math.abs(s.charAt(0)-s.charAt(1));
        }
        char [] ch = s.toCharArray();
        int right = 1;
        int left = 0;
        int sum = 0;
        while(right<len){
            sum += Math.abs(ch[right++]-ch[left++]);
        }
        return sum;
    }
}
