class BankAccount {
    private double blance;

    public void setBlance(double blance){
        if(blance>0){
            this.blance = blance;
        }
    }

    public double getBalance(){
        return blance;
    }
}
public class oop2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
    }
}
