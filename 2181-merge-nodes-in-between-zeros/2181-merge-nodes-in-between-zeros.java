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
    public ListNode mergeNodes(ListNode head) {
        if(head.val == 0) head = head.next;
        
        ListNode node = head;
        ListNode temp = head;
        
        int sum =0;
        
        while(temp != null){
            if(temp.val !=0){
                sum += temp.val;
                temp = temp.next;
            } else{
                node.val = sum;
                node.next = temp.next;
                
                temp = temp.next;
                node = node.next;
                sum = 0;
            }
        }
        return head;
    }
}