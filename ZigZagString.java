public class ZigZagString {
    public static void main(String[] args) {
        SolutionZZ s=new SolutionZZ();
        System.out.println(s.convert("PAYPALISHIRING",3));
    }
}
class SolutionZZ {
    public String convert(String s, int numRows) {
        if(s.length()<3){
            return s;
        }
        else if(numRows>=s.length()){
            return s;
        }
        String ans="";
        int down=(numRows-2)*2+2;
        int up=0;
        for(int i=0;i<numRows;i++){
            System.out.println(down+" "+up);
            int point=i;
            ans+=s.charAt(point);
            System.out.println(ans);
            while(point<s.length()){
                if(down>0 && point+down<s.length()){
                    point+=down;
                    ans+=s.charAt(point);
                }
                else{
                    point+=down;
                }
                if(up>0 && point+up<s.length()){
                    point+=up;
                    ans+=s.charAt(point);
                }else{
                    point+=up;
                }
            }
            down-=2;
            up+=2;
            
        }
        return ans;
    }
}
