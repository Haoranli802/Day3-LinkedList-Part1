//LeetCode 203
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode cur = new ListNode(0, head);
        ListNode temp = cur;
        while(cur != null && cur.next != null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }
            else{
                cur = cur.next;
            }
        }
        return temp.next;
    }
}

// Time: O(N) Space: O(1) 虚拟节点
