import java.util.HashSet;
public class ValidSudoku {
    public static void main(String[] args) {
        String ch[][]={
        
         {"5","3",".",".","7",".",".",".","."}
        ,{"6",".",".","1","9","5",".",".","."}
        ,{".","9","8",".",".",".",".","6","."}
        ,{"8",".",".",".","6",".",".",".","3"}
        ,{"4",".",".","8",".","3",".",".","1"}
        ,{"7",".",".",".","2",".",".",".","6"}
        ,{".","6",".",".",".",".","2","8","."}
        ,{".",".",".","4","1","9",".",".","5"}
        ,{".",".",".",".","8",".",".","7","9"}};
        System.out.println(Solution.check(ch));
    }
}
class Solution 
{
    public static boolean check(String[][] board){
        for(int i=0;i<9;i++){
            HashSet<String> h1=new HashSet<>();
            HashSet<String> h2= new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!="."){
                    if(h1.add(board[i][j])==false){
                        return false;
                    }
                }
                if(board[j][i]!="."){
                    if(h2.add(board[j][i])==false){
                        return false;
                    }
                }
            }
            
        }

        for(int d=0;d<9;d+=3){
            for(int k=0;k<9;k+=3){
                HashSet <String> h= new HashSet<>();
                for(int i=d;i<d+3;i++){
                    for(int j=k;j<k+3;j++){
                        if(board[i][j]!="."){
                            if(h.add(board[i][j])==false){
                                System.out.println(h);
                                return false;
                            }
                            
                            
                        }
                    }
                    
                }
                
            }
        }
        return true;
    }
}
/*
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]] */