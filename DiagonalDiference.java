 public static int diagonalDifference(List<List<Integer>> arr) {
   int primarydiagonal=0;
    int secondarydiagonal=0;
    for(int i=0;i<arr.size();i++){
        primarydiagonal+= arr.get(i).get(i);
    }
    for (int i=0;i<arr.size();i++){
        secondarydiagonal+= arr.get(i).get(arr.size()-(i+1));
    }
return Math.abs(primarydiagonal-secondarydiagonal);
    }

}
