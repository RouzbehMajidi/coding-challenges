# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        
        l_result = None
        l_result_curr = None
        carry = 0
        
        while l1 is not None or l2 is not None or carry:
            l1Val = l1.val if l1 else 0
            l2Val = l2.val if l2 else 0
            result = l1Val + l2Val + carry
            
            if result > 9:
                carry = 1
                result %= 10
            else:
                carry = 0
            
            if l_result_curr is None:
                l_result = ListNode(result)
                l_result_curr = l_result
            else:
                l_result_curr.next = ListNode(result)
                l_result_curr = l_result_curr.next
                
            if l1:
                l1 = l1.next
                
            if l2:
                l2 = l2.next
            
        
        return l_result