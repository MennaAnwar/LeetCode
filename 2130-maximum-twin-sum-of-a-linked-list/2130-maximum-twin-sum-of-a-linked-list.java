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
    public int pairSum(ListNode head) 
    {
        ListNode curr=head;
        ArrayList <Integer> list= new ArrayList<>();
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        int n=list.size();
        int maxtwin=0;
        for(int i=0;i<n;i++){
            int currtwin=list.get(i)+list.get(n-1-i);
            maxtwin=Math.max(maxtwin,currtwin);
        }
        return maxtwin;

    }
}