import Leetcode_classes.*;
public class ReverseLinkList {
    public static void main(String[] args) {
        // Bhai dekh yeh jo hai woh recusion and iteration vala approach hai !. Mast Kam karta hai "0 ms"
    }    
}


class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        return combineMethod(null,head,head.next);   
    }
    private ListNode combineMethod(ListNode prev, ListNode curr, ListNode Next){
        if(Next == null){
            return curr;
        }
        ListNode head = combineMethod(curr,Next,Next.next);
        Next.next = curr;
        curr.next = prev;
        return head;
    }
}
