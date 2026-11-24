 class BankAccount{
    private String accountHolder;
    private double balance;
    public void getter(){
       System.out.println("Balance: " + balance);
    }
    public void setter(double b){
        if(b >= 0){
            balance = b;
        }
        else{
            System.out.println("Invalid Balance");
        }
    }
 }
 class balance{
    public static void main(String[] args){
        BankAccount b = new BankAccount();
        b.getter();
        b.setter(1000);
        b.getter();
        b.setter(-500);
    }
 }

