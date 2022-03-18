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
    public ListNode partition(ListNode head, int x) {
        ListNode result = new ListNode(0, head);
        ListNode temp = result;
        ListNode pointer = result;
        
        while(pointer.next != null){
            if(pointer.next.val < x){
                if(pointer == temp){
                    pointer = pointer.next;
                } else if(temp.next != null && pointer.next != null){
                    this.swap(temp, pointer);
                }
                temp = temp.next;
            } else{
                pointer = pointer.next;
            }
        }
        
        return result.next;
    }
    
    private void swap(ListNode l1, ListNode l2){
        ListNode temp = l2.next;
        l2.next = temp.next;
        temp.next = l1.next;
        l1.next = temp;
    }
}