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
        if(head == null) return false;
        if(head.next == null) return false;
        HashSet<ListNode> set = new HashSet<ListNode>();
        
        while(true){
            if(set.contains(head)) return true;
            set.add(head);
            head = head.next;
            if(head == null) return false;
        }
    }
}