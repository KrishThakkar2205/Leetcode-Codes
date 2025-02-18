import Leetcode_classes.*;
public class ListNodeTwoSum {
    public static void main(String[] args) {
        ListNode l1= new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next= new ListNode(3);  
        ListNode l2=new ListNode(5);
        l2.next= new ListNode(6);
        l2.next.next= new ListNode(4);
        ListNode l3=Solution.addTwoNumbers(l1, l2);
        System.out.println();
        while(l3!=null){
            System.out.print(l3.val);
            l3= l3.next;
        }
    }
}
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
class Solution{
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int value1=get(l1)/10;
        int value2=get(l2)/10;
        ListNode l3= new ListNode();
        make(value1+value2,l3);
       
        return l3;
    }
    public static int get(ListNode l){
        if(l.next==null){
            return l.val*10;
        }
        return (get(l.next)+l.val)*10;
    }
    
    static ListNode make(int val,ListNode l3){
        if(val/10==0){
            l3.val=val;
            return l3;
        }
        l3.val=val%10;
        val=val/10;
        l3.next=new ListNode();
        make(val,l3.next);
        return l3;
    }
}
