class Solution {
    public int addDigits(int num) {
        int sum=0;
       while(num>=10){
           int rem=num%10;
           int q=num/10;
           sum=rem+q;
           num=sum;

       } 
       return num;
    }
}
