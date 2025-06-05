public class PrioritySet extends Thread{
    public PrioritySet(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println("Running Threads..."+Thread.currentThread().getName()+" Priority " +Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        PrioritySet t1 = new PrioritySet("Max Priority");
        PrioritySet t2 = new PrioritySet("Nom priority");
        PrioritySet t3 = new PrioritySet("Min Priority");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
