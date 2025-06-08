public class NewThreads1 extends  Thread{
    Counter1 counter1;
    NewThreads1(Counter1 counter1){
        this.counter1 = counter1;
    }

    @Override
    public void run() {
        for(int i =0;i<1000;i++){
            counter1.increment();
        }
    }
}
