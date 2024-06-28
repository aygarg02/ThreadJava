

public class MonicaAndRyan implements Runnable {
private    BankAccount account=new BankAccount();
    public static void main(String[] args) {
        
        Runnable r=new MonicaAndRyan();
        Thread monica=new Thread(r);
        Thread rayan =new Thread(r);
        
        monica.setName("monica");
        rayan.setName("Rayan");
        monica.start();
        rayan.start();        
    }

    @Override
    synchronized public void run() {
     for(int i=0;i<20;i++){   
        System.out.print(account.balance()+" "+Thread.currentThread().getName()+" <--sthis is the owner name");
       if( account.balance()>20){
        account.withdraw(20);
        System.out.println(Thread.currentThread().getName()+" name of the thread   "+account.balance());
       }
       System.out.println();
    }
    }


}