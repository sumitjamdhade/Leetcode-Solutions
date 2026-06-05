/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
    
        ListNode jump = head;
        ListNode jumpTwice = head;
        while(jumpTwice != null && jumpTwice.next != null ){
            jump = jump.next;
            jumpTwice = jumpTwice.next.next;

            if(jump == jumpTwice)
            return true;
        }
        
        return false;

    }
}
