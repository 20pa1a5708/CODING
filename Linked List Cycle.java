 if(head==null||head.next==null)
        return false;
        Node fast=head;
        Node slow=head;
        while(fast.next!=null&&fast.next.next!=null){
        
        fast=fast.next.next;
        slow=slow.next;
        
        if(slow==fast)
        return true;
    }
    return false;
}
}
