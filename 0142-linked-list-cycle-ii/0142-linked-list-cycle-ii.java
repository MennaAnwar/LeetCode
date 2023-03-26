/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        
         ListNode current = head;
        ListNode Next = head;
        while(Next!=null && Next.next!=null){
            current=current.next;
            Next=Next.next.next;
            if(current==Next){
               while(head!=current){
                   head=head.next;
                   current=current.next;
               }
               return current;
            }
        }
        return null;
    }
}