public class RunnableThreads implements Runnable {
    public void run(){
        for(int i = 0;i<=10;i++){
            System.out.println("Running "+i);
        }
    }

    public static void main(String[] args) {
        RunnableThreads task = new RunnableThreads();
        Thread t1 = new Thread(task);
        t1.start();
    }
}
