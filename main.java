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

//LeetCode 707

class ListNode {
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val) {
        this.val=val;
    }
}

class MyLinkedList {

    ListNode head;
    int size;
    public MyLinkedList() {
        head = new ListNode(0);
        size = 0;
    }
    
    public int get(int index) {
        if(index < 0 || index >= size) return -1;
        ListNode temp = head;
        for(int i = 0; i < index + 1; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        ListNode temp = new ListNode(val);
        temp.next = head.next;
        head.next = temp;
        size++;
    }
    
    public void addAtTail(int val) {
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new ListNode(val);
        size ++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) return;
        else if(index == 0) addAtHead(val);
        else if(index == size) addAtTail(val);
        else{
            ListNode temp = head;
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
            ListNode cur = new ListNode(val);
            cur.next = temp.next;
            temp.next = cur;
            size ++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;
        else if(size == 0) return;
        else{
            ListNode temp = head;
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size --;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

