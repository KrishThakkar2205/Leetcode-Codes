import Leetcode_classes.*;
public class MergeLLinBetween {
    // Bhai Mereko Kantala aa raha tha !. app add karlo LinkList or check karlo Mast kam karta hai  
}



class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head = list1;
        ListNode temp = null;
        int counter = 0;
        while(head != null){
            if(counter == a-1){
                temp = head.next;
                head.next = list2;
                head = temp;
                break;    
            }
            head=head.next;
            counter++;
        }
        while(list2.next != null){
            list2=list2.next;
        }
        while(head != null){
            if(counter == b+1){
                list2.next = head;
                break;    
            }
            head=head.next;
            counter++;
        }

        return list1;
    }
}
