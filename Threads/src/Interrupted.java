public class Interrupted extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        System.out.println("Thread is running...");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Interrupted t1 = new Interrupted();
        t1.start();
        t1.interrupt();
    }
}
