    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
    {
 SinglyLinkedListNode current=new SinglyLinkedListNode(data);
if(position==0){
current.next=llist;
llist=current;
return llist;
    }
SinglyLinkedListNode p=llist;
for(int i=1;i<position;i++){
p=p.next;
}
current.next=p.next;
p.next =current;

return llist;
    }

    }
}
