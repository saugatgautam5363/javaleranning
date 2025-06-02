public class World implements Runnable {
    //public class World extend Threads
    @Override
    public void  run(){
        for(; ;){
            System.out.println("world");
        }
    }
}
