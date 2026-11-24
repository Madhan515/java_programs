class Account{
    int accountnumber;

    void shownumber(){
        System.out.println("Account number:" + accountnumber);
    }
}
class savingAccount extends Account{
    double interestrate;

    void showsavingdetails(){
        System.out.println("Showsavingdetails:" + interestrate);
    }
}
class FixeddepositeAccount extends savingAccount{
    int lockinyear;

    void showFFDetails(){
        System.out.println("showFFDetails:" + lockinyear);
    }
}
class Amountdeposite{
    public static void main(String[] args){
        Account a = new Account();
        savingAccount sa = new savingAccount();
        FixeddepositeAccount fd = new FixeddepositeAccount();

        a.accountnumber = 1234567890;
        sa.interestrate = 5;
        fd.lockinyear = 2021;

        a.shownumber();
        sa.showsavingdetails();
        fd.showFFDetails();
    }
}