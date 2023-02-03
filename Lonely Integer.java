  public static int lonelyinteger(List<Integer> a) {
    // Write your code here
    Collections.sort(a);
    int result=0;
    for(int i=0;i<a.size();i++){
        result = result^a.get(i);
        }
    
return result;
    }

}
