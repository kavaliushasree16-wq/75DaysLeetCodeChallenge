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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;
        Stack<ListNode> stack = new Stack<>();

        
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }


        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;

            fast = fast.next.next;
        }

        ListNode current = head;
        while (current != slow) {
            ListNode last = stack.pop();
            ListNode currentNext = current.next;

            current.next = last;
            last.next = currentNext;

            current = currentNext;

        }
        current.next = null;

    }
}