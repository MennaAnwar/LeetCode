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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode first = temp;
        ListNode second = temp;
        for(int i = 1; i <= k; i++){
            first = first.next;
        }
        ListNode curr = first;

        while(curr != null){
            curr = curr.next;
            second = second.next;
        }

        int t = first.val;
        first.val = second.val;
        second.val = t;
        
        return temp.next;
    }
}