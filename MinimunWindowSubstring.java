public class MinimunWindowSubstring {
    public static void main(String[] args) {
        Window w=new Window();
        System.out.println("Ans "+w.minWindow("bba","ab"));
    }
}
class Window {
    public String minWindow(String s, String t) {
        if(s.length()==t.length() && s.equals(t)){
            return s;
        }
        else if(s.length()<t.length()){
            return "";
        }
        else if(s.contains(t)){
            return t;
        }
        int m=s.length();
        int n=t.length();
        
        
        for(int i=0;i<m-n+1;i++){
            int left=0;
            int right=n+i-1;
            while(right<m){
                
                System.out.println(s.substring(left,right+1));
                if(CheckString(left,right,i,s,t)){
                    return s.substring(left,right+1);
                }
                left++;
                right++;
            }
        }
        return "";
    }
    
    boolean CheckString(int left,int right,int diff,String s,String t){
        int ans=0;
        StringBuffer sb=new StringBuffer("");
        while(left<=right){
            int a=t.indexOf(s.charAt(left));
            if(a==-1){
                ans++;
                left++;
                continue;
            }
            sb.append(t.charAt(a));
            left++;
        }
        return diff==ans;

    }
}