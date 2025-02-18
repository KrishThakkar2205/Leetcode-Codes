
/*
 * 846 : Hand Of Straights
 */
import java.util.*;

public class Leetcode846 {
    public static void main(String[] args) {
        int[] hand = { 1, 2, 3, 6, 2, 3, 4, 7, 8 };
        Solution846 sol = new Solution846();
        System.out.println(sol.isNStraightHand(hand, 3));
    }
}

class Solution846 {
    int lastIndex = -1;

    public boolean isNStraightHand(int[] hand, int groupSize) {
        // if(hand.length%groupSize != 0){
        // return false;
        // }
        // int pair = hand.length/groupSize;
        // boolean [] flg = new boolean[hand.length];
        // Arrays.sort(hand);
        // for(int i=0; i<pair; i++){
        // int count = 0;
        // int prevInd = -1;
        // for(int j=0; j<hand.length && count<groupSize; j++){
        // if(!flg[j]){
        // if(prevInd == -1){
        // count++;
        // flg[j] = true;
        // prevInd = j;
        // // System.out.print(hand[j]);
        // } else {
        // if(hand[j] - hand[prevInd] == 1){count++;
        // flg[j] = true;
        // prevInd = j;
        // // System.out.print(hand[j]);
        // }

        // }

        // }
        // }
        // // System.out.println();
        // }
        // for(boolean f:flg){
        // if(!f){return f;}
        // }

        // Above Commented Code is BruteForce Approach

        // If the current size is not divisible by group size
        if (hand.length % groupSize != 0) {
            return false;
        }

        // Counting the frequecy of the current group numbers
        HashMap<Integer, Integer> map = new HashMap<>();

        // storing the frequency
        for (int i : hand)
            map.put(i, map.getOrDefault(i, 0) + 1);

        // sorting the array
        Arrays.sort(hand);

        // Traversing over the array for each group
        for (int i : hand) {
            if (map.getOrDefault(i, 0) == 0)
                continue;
            int curr = i, currGrp = 0;

            while (currGrp != groupSize) {
                if (map.getOrDefault(curr, 0) == 0)
                    return false;
                else {
                    currGrp++;
                    map.put(curr, map.get(curr) - 1);
                    curr++;
                }
            }
        }

        return true;
    }
}