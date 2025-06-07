public class Second extends  Thread {
    String msg;
    First1 obj;
    Second(First1 fp,String str){
        obj = fp;
        msg = str;
    }

    @Override
    public void run() {
        synchronized (obj){
            try {
                obj.display(msg);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
