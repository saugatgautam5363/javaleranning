public class Main0 {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(100);
            }
        };
        Thread t1 = new Thread(task,"Threads 1");
        Thread t2 = new Thread(task,"Threads 2");
        t1.start();
        t2.start();
    }
}
