public class Table {
    synchronized void printTable(int n) throws InterruptedException {
        for(int i =0;i<=5;i++){
            System.out.println(n*i);
            Thread.sleep(4000);
        }
    }
}
