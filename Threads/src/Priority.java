public class Priority extends Thread {
    public Priority(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println("Running Threads.."+Thread.currentThread().getName()+" Priority "+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Priority s = new  Priority("Max Priority");
        Priority e = new Priority("Nom Priority");
        Priority f = new Priority("Min priority");

        s.setPriority(Thread.MAX_PRIORITY);
        e.setPriority(Thread.NORM_PRIORITY);
        f.setPriority(Thread.MIN_PRIORITY);

        s.start();
        e.start();
        f.start();

    }
}
