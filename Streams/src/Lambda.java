public class Lambda {
    public static void main(String[] args) {
        mathOperation sum = (a,b) -> (a+b);
        mathOperation sub = (a,b) -> (a-b);
        int result = sum.operation(1,4);
        System.out.println(result);
    }
}
interface mathOperation{
    int operation(int a,int b);
}