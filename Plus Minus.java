public static void plusMinus(List<Integer> arr) {
    float positive=0;
 float negative=0;
  float zero=0;
  int size=arr.size();
  for(int i=0;i<size;i++){
      if(arr.get(i)>0){
          positive+=1;
      }
      else if(arr.get(i)<0){
          negative+=1;
      }
      else
          zero+=1;
      }
      System.out.format("%.6f \n",positive/size);
      System.out.format("%.6f \n",negative/size);
      System.out.format("%.6f",zero/size);
  }
    }
