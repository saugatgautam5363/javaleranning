public class Lamdba1 {
    public static void main(String[] args) {
        mathOperation0 sum = (a,b)-> (a+b);
        mathOperation0 sub =(a,b)->(a-b);

        int result = sum.operation(3,9);
        System.out.println(result);
    }
}
interface mathOperation0{
    int operation(int a,int b);
}
