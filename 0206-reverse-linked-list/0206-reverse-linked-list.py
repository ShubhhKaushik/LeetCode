from collections import deque
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution(object):
    def reverseList(self, head):
        self.head = head
        curr = self.head
        stack = deque()
        while curr is not None:
            stack.append(curr.val)
            curr = curr.next
        
        curr = self.head
        while len(stack)>0:
            ele = stack.pop()
            curr.val = ele
            curr = curr.next
        return self.head
    


        
        
        