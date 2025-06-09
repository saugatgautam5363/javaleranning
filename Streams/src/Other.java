public class Other {
    public static void main(String[] args) {
        mathOperation1 sum = (a,b)->(a+b);
        mathOperation mul = (a,b)-> (a*b);
        double result = sum.operation(2,6);
        double multiply = mul.operation(6,8);
        System.out.println(result);
        System.out.println(multiply);
    }
}
interface mathOperation1{
    double operation(double a,double b);
}