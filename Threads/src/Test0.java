public class Test0 {
    public static void main(String[] args) {
        Counter1 counter1 = new Counter1();
        NewThreads1 t1 = new NewThreads1(counter1);
        NewThreads1 t2 = new NewThreads1(counter1);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(counter1.getCount());
    }
}
