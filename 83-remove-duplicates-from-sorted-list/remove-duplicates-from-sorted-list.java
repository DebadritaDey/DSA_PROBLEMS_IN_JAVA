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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode Node = head;
        while(Node.next != null){
            if(Node.val == Node.next.val){
                Node.next = Node.next.next;
            }else{
                Node = Node.next;
            }
        }
        return head;
    }
}