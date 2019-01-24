/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode sortedListHead = null;
        ListNode previousNode = null;
        ListNode currentSorted = null;

        while(true){
            Integer value; 
            
            if(l1 != null && l2 != null){
                if(l1.val < l2.val){
                    value = l1.val;
                    l1 = l1.next;
                }else{
                    value = l2.val;
                    l2 = l2.next;
                }
            }else if(l1 != null) {
                value = l1.val;
                l1 = l1.next;
            }else if(l2 != null) {
                value = l2.val;
                l2 = l2.next;
            }else{
                return sortedListHead;
            }

            if(sortedListHead == null){
                sortedListHead = new ListNode(value);
                currentSorted = sortedListHead;
            }else{
                currentSorted = new ListNode(value);
                previousNode.next = currentSorted;
            }         
            
            previousNode = currentSorted;
            currentSorted = currentSorted.next;
        }

    }
}