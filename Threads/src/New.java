public class New extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        System.out.println("Thread is running...");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        New t1 = new New();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
        t1.interrupt();
        System.out.println(t1.getState());
    }
}
