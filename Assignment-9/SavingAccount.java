class BankAccount{
      double balance = 500;
    void deposite(double amount){
        balance=balance+amount;
    System.out.println("Deposited:"+amount);
}
void withdraw(double amount){
      balance=balance-amount;
System.out.println("Withdraw:"+amount);
}
  }
class SavingAccount extends BankAccount{
      void withdraw(double amount){
 if(balance-amount<100){
   System.out.println("withdraw  not possible");
}
else{
balance=balance-amount;
System.out.println("Withdrawn:"+amount);
}
 }
public static void main(String args[]){
   SavingAccount s = new SavingAccount();
       s.deposite(100);
       s.withdraw(400);
  System.out.println("Balance:"+s.balance);
}
}