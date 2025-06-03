public class ThreadsMethods extends Thread {
    @Override
    public void run() {
        for(int i = 0;i<=10;i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(i);

        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadsMethods t1 = new ThreadsMethods();
        t1.start();
        t1.join();
        System.out.println("Hello");
    }
}
