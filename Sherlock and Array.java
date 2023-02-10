 public static String balancedSums(List<Integer> arr) {
        int sum=0;
    for(int i=0;i<arr.size();i++){
        sum+=arr.get(i);
    }
    int curr=0;
    for(int j=0;j<arr.size();j++){
       if(curr==sum-arr.get(j)-curr){
        return "YES";
       }
       curr+=arr.get(j);
    }
    
return "NO";
    }
}
