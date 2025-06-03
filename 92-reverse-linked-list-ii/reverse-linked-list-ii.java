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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next==null || left == right){
            return head;
        }
        ListNode curr = head;
        ListNode pre  = null;
        for(int i = 1; curr!=null && i <left; i++){
            pre = curr;
            curr = curr.next;
        }
        ListNode start = pre;
        ListNode end = curr;
        int itr = right - left + 1;
        ListNode nextNode = curr.next;
        for(int i = 1; curr!=null &&  i <= itr; i++){
            curr.next = pre;
            pre = curr;
            curr = nextNode;
            if(nextNode!=null)
            {
                nextNode = nextNode.next;
            }
            
        }
        if(start!=null)
        {
          start.next = pre;
        }
        else 
        {
            head = pre;
        }
        
        end.next = curr;
        return head;

    }
}