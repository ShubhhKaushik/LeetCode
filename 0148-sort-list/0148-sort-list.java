class Solution {
    public ListNode sortedMerge(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode i = head1;
        ListNode j = head2;
        while(i!=null && j!=null){
            if(i.val<=j.val){
                temp.next = i;
                i = i.next;
            }else{
                temp.next = j;
                j = j.next;
            }
            temp = temp.next;
        }
        if(i==null) temp.next = j;
        else temp.next = i;
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head = sortList(head);
        head2 = sortList(head2);
        return sortedMerge(head,head2);
    }
}