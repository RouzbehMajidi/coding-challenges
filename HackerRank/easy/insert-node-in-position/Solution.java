public class Solution {
   // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        
        SinglyLinkedListNode currentNode = head;
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        
        if(head == null){
            head = newNode;
            return head;
        }
        
        for(int i = 0; i < position - 1; i ++){
            currentNode = currentNode.next;
        }
        
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        
        return head;
    }
}