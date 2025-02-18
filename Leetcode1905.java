// import java.util.*;
public class Leetcode1905 {
    public static void main(String [] args){
        Solution1905 s = new Solution1905();
        int grid1[][] = {{1,1,1,0,0},
                        {0,1,1,1,1},
                        {0,0,0,0,0},
                        {1,0,0,0,0},
                        {1,1,0,1,1}};

        int grid2[][] = {{1,1,1,0,0},
                        {0,0,1,1,1},
                        {0,1,0,0,0},
                        {1,0,1,1,0},
                        {0,1,0,1,0}};

        int ans = s.countSubIslands(grid1, grid2);

        System.out.println(ans);
    }
}

class Solution1905 {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid1.length;
        int n = grid1[0].length;
        int sunIsland = 0;
        int notLandRow = -1;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if((grid1[i][j]==0 && grid2[i][j]==0) || (grid1[i][j]==1 && grid2[i][j]==0)){
                    continue;
                } else if(grid1[i][j]==1 && grid2[i][j]==1 ){
                    if(notLandRow+1!=i && notLandRow!=-1 && grid2[i-1][j]!=1){
                        if(i!=0 && grid2[i-1][j]==1 && grid1[i-1][j]==1 && sunIsland>0){
                            sunIsland--;
                        }
                        while(j<n && grid1[i][j]==1 && grid2[i][j]==1){
                            j++;
                        }
                        sunIsland++;
                        j--;
                    }
                } else {
                    if(i!=0 && grid2[i-1][j]==1 && grid1[i-1][j]==1){
                        sunIsland--;
                    }
                    notLandRow = i;
                    j=n-1;
                }
            }
        }
        return sunIsland;
    }       
}
