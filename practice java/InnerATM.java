abstract class ATM{
    abstract void insertCard();
    abstract void enterPin();
    abstract void withderawMoney();

    void checkBalance(){
        System.out.println("Checking blance....");
    }
}
class MyATM extends ATM{
    void insertCard(){
        System.out.println("Insert Card..");
    }

    void enterPin(){
        System.out.println("Enter the ATM Card Number..");
    }
    void withderawMoney(){
        System.out.println("Withdrawing money....");
    }
}

public class InnerATM {
    public static void main(String[] args) {
        ATM card = new MyATM();
        card.insertCard();
        card.enterPin();
        card.withderawMoney();
        card.checkBalance();
    }
}