Collections.sort(arr);
Integer min=Integer.MAX_VALUE;
for(int i=0;i<=arr.size()-k;i++)
{
 int diff=arr.get(i+k-1)-arr.get(i);
 if(diff<min){
     min=diff;
 }
}
return min;
    }

}
