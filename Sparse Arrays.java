 public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
   int count=0;
   ArrayList<Integer> arr=new ArrayList<>();
   for(int i=0;i<queries.size();i++){
       for(int j=0;j<strings.size();j++){
           if(queries.get(i).equals(strings.get(j))){
               count+=1;
           }
       }
       arr.add(count);
       count=0;
   }
return arr;
    }

}
