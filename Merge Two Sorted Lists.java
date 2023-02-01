struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2){
 struct ListNode*cur;
 struct ListNode*head;
   if (list1==NULL && list2==NULL){return list1;}
     else if(list1==NULL){
         return list2;
     }
     else if(list2==NULL){
         return list1;
     }
     else{
    if(list1->val<=list2->val){
        head=list1;
        list1=list1->next;
    }
     else{
        head=list2;
        list2=list2->next; 
     }
     cur=head;
     while(list1!=NULL && list2!=NULL){
     if(list1->val <=list2->val){
         cur->next=list1;
         list1=list1->next;
         cur=cur->next;
     }
    else{
        cur->next=list2;
        list2=list2->next;
        cur=cur->next;
    }
    }
         if(list1==NULL){
        while(list2->next!=NULL){
            cur->next=list2;
            list2=list2->next;
            cur=cur->next;
        }
        cur->next=list2;
    }
    else{
        while(list1->next!=NULL){
            cur->next=list1;
            list1=list1->next;
            cur=cur->next;
         }
        cur->next=list1;
    }
     
         
  return head;
    }
}
