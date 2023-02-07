 public static List<Integer> countingSort(List<Integer> arr) {
    ArrayList<Integer> result=new ArrayList<>();
    for(int i=0;i<100;i++){
        result.add(0);
    }
for(int x: arr){
    result.set(x,result.get(x)+1);
}
return result;
    }

}
