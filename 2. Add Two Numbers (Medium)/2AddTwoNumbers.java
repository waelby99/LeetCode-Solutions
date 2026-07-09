/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0;
        int rest=0;
        ListNode l3=null;
        ListNode current=null;

        while((l1!=null) ||  (l2!=null)){
           
            if(l1!=null && l2!=null){sum=l1.val+l2.val;}
            if(l1==null){
                sum=l2.val;
            }
            if(l2==null){
                sum=l1.val;
            }
            if(rest==1){
                sum =sum + rest;
                rest--;
            }
            if (sum>9){
                sum=sum%10;
                rest++;
            }
            if(l1!=null && l2!=null) {
            l1=l1.next;
            l2=l2.next;
            }
            else if( l1!=null && l2==null){
                l1=l1.next;
            }
            else if( l1==null && l2!=null){
                l2=l2.next;
            }
            
            ListNode f = new ListNode(sum);
            if(l3==null){
            l3=f;
            current=f;    
            }else{
                current.next=f;
                current=f;
            }
            
            
        }

        if(current.next==null && rest!=0){
            ListNode a = new ListNode(rest);
             current.next=a;
                current=a;
            }
        return l3;
    }
}