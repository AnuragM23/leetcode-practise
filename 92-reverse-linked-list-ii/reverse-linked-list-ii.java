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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;
        ListNode t = head;
        for(int i=1; i<left; i++){
            t = t.next;
        }
        ListNode before = t;
        int[] arr = new int[right-left+1];
        for(int i=0; i<right-left+1; i++) {
            arr[i] = t.val;
            t = t.next;
        }

        for(int i=right-left; i>=0; i--) {
            before.val = arr[i];
            before = before.next;
        }
        return head;
    }
}