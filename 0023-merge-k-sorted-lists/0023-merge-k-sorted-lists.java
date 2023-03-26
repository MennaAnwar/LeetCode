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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0]; 
        return splitAndMerge(lists, 0, lists.length - 1);
    }

    private ListNode splitAndMerge(ListNode[] lists, int start, int end) {
        if(start == end) return lists[start];
        int mid = (end - start) / 2 + start;
        return merge(splitAndMerge(lists, start, mid),
                     splitAndMerge(lists, mid + 1, end));
    }

    private ListNode merge(ListNode list1, ListNode list2) {
        ListNode output = new ListNode();
        ListNode node = output;

        while(true) {
            if(list1 == null) {
                node.next = list2;
                break;
            }
            if(list2 == null) {
                node.next = list1;
                break;
            }
            if(list1.val > list2.val) {
                node = node.next = list2;
                list2 = list2.next;
            } else {
                node = node.next = list1;
                list1 = list1.next;
            }
        }
        return output.next;
    }
}