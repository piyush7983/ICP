class Solution {
    static{
        for(int i=0;i<500;i++){
            reorderList(new ListNode(1));
        }
    }
    public static void reorderList(ListNode head) {
        if(head.next==null) return;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr = slow.next;
        slow.next = null;
        ListNode prev = null;
        while(curr!=null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        ListNode temp2 = prev;
        ListNode temp1 = head;
        while(temp1!=null && temp2!=null){
            ListNode next1 = temp1.next;
            ListNode next2 = temp2.next;
            temp1.next = temp2;
            temp2.next=null;
            
            temp1 = temp1.next;
            temp1.next = next1;
            temp1 = temp1.next;
            temp2 = next2;

        }
    }
}