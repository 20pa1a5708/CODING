if(llist==null||llist.next==null)
    return null;
    SinglyLinkedListNode p=llist;
    SinglyLinkedListNode q=p.next;
    p.next=null;
    SinglyLinkedListNode r=q.next;
    while(q!=null){
        q.next=p;
        p=q;
        q=r;
        if(r!=null){
            r=r.next;
        }
    }
    return p;

    }

}
