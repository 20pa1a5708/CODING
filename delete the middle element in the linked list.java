class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode dummy=new ListNode(0,head);
        ListNode slow=dummy,fast =dummy;
while(fast.next!=null && fast.next.next!=null){
    slow=slow.next;
    fast=fast.next.next;
}
 slow.next=slow.next.next;
 return dummy.next;
    }
}

