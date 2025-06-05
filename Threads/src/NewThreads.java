public class NewThreads extends Thread{
    Counter counter;
    NewThreads(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i = 0;i<1000;i++){
            counter.increment();
        }
    }
}
