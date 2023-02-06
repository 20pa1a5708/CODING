class IntegerList{
   private int[] list;
    private int elementIndex=0;

public IntegerList(int size){
   list= new int [size]; 
  
}
public void add(int value){
    if(list.length>elementIndex){
        list[elementIndex++]=value;
    }
    else{
         System.out.println("can't add, list is full");
    }
}
public String toString(){
    for(int i=0;i<list.length;i++)
    {
    System.out.println(i + " : " +list[i]);
    }
    return "";
}
}
