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
    public ListNode middleNode(ListNode head) {
        if(head==null) return head;
        ListNode slow = head;
        ListNode fast = head;
        int size = 0;
        while(fast!=null){
            size++;
            fast = fast.next;
        }
        int mid = 0+(size-0)/2;
        for(int i=0;i<mid;i++){
            slow = slow.next;
        }
        return slow;
    }
}