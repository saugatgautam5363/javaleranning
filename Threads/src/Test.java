public class Test {
    public static void main(String[] args) {

    Counter counter = new Counter();
    NewThreads t1 = new NewThreads(counter);
    NewThreads t2 = new NewThreads(counter);
    t1.start();
    t2.start();
    try{
        t1.join();
        t2.join();
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
        System.out.println(counter.getCount());
    }

}
