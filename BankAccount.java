class Bank{
    private String name;
    private int acc;
    private int bal;
    private static int accountTrace;
    public Bank(String s1)
    {
        name=s1;
        acc=accountTrace++;
      }
    public static void setAccountTrace(int value){
        accountTrace=value;
        }
    public int getAcc(){
        return acc;
    }
public String getName(){
    return name;
}
    public int getbal(){
        return bal;
    }
    public void deposit(int n){
        bal+=n;
    }
    public void withdraw(int m){
        if(bal<m){
            System.out.println("Negative Balance Transaction Cancelled");
            
        }
        else{
            bal-=m;
        }
    }
    public void display()
    {
        System.out.println(acc+" "+name+" "+bal);
    }
}
