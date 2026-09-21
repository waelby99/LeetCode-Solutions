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
    //very space and time complexity needs to be re-done 
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> al = new ArrayList<>();
        while( head != null ){
            al.add(head.val);
            head = head.next;
        }
        al.sort(null);
        ListNode res = null;
        ListNode current = null;
        for (Integer x:al){
            ListNode f = new ListNode(x);
            if(res == null){
                res = f;
                current = f;
            }
            else{
                current.next = f;
                current = f;
            }
        }
        return res;
    }
}