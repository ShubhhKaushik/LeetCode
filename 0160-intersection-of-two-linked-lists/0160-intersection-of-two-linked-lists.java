/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;
        int size1 = 0;
        while(temp!=null){
            size1++;
            temp = temp.next;
        }
        temp = headB;
        int size2=0;
        while(temp!=null){
            size2++;
            temp = temp.next;
        }
        temp=headA;
        ListNode temp1 = headB;
        if(size1>size2){
            for(int i=1;i<=size1-size2;i++){
                temp = temp.next;
            }
        }
        if(size1<size2){
            for(int i=1;i<=size2-size1;i++){
                temp1=temp1.next;
            }
        }
        while(temp!=temp1){
            temp = temp.next;
            temp1 = temp1.next;
        }
        return temp;
    }
     
}