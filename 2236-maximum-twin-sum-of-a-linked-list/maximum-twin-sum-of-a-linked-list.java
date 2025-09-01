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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = reversell(slow.next);
        slow.next = temp;
        ListNode p1 = head;
        ListNode p2 = slow.next;
        int max = 0;
        while(p2!= null){
            int val = p1.val + p2.val;
            if(val>max){
                max = val;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return max;
        
    }

    public ListNode reversell(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode newhead = reversell(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
    }
}