public class Test1 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        System.out.println("Running ");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.start();
        t1.interrupt();
        System.out.println(t1.getState());
    }
}
