public class BankAccount {

    private int balance=100;
   
    int balance(){
        return balance;
    }
    void withdraw(int amount){
        balance-=amount;

    }
}