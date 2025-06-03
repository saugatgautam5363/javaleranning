public class YieldMethod extends Thread {
    public YieldMethod(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i = 0;i<5;i++){
            System.out.println(getName()+" Running ");
//            Thread.yield();
        }
    }

    public static void main(String[] args) {
        YieldMethod t1 = new YieldMethod("t1");
        YieldMethod t2 = new YieldMethod("t2");
        t1.start();
        t2.start();
    }
}

//Using yield method output
//t2 Running
//t1 Running
//t2 Running
//t1 Running
//t2 Running
//t1 Running
//t2 Running
//t1 Running
//t2 Running
//t1 Running

//No use of yield method output
//t1 Running
//t2 Running
//t2 Running
//t2 Running
//t2 Running
//t2 Running
//t1 Running
//t1 Running
//t1 Running
//t1 Running
