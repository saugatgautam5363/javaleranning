public class DemonThreads extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Hello world!!");
        }
    }

    public static void main(String[] args) {
        DemonThreads threads = new DemonThreads();
        threads.setDaemon(true);
//        DemonThreads t1 = new DemonThreads();
//        t1.start();
        threads.start();
        System.out.println("Main done");
    }
}
