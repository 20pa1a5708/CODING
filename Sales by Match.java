HashSet<Integer>set=new HashSet<>();
 int result=0;
 for(int i=0;i<n;i++){
     if(!set.contains(ar.get(i))){
         set.add(ar.get(i));
     }
     else{
         set.remove(ar.get(i));
         result++;
     }
 }
return result;
    }
    
}
