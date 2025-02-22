class MathOperation{
    int add(int a,int b){
        return a+b;
    }
    int add(int a, int b,int c){
        return a+b+c;
    }
    int multiply(int a,int b){
        return a*b;
    }
}
public class oopin3 {
    public static void main(String[] args) {
        MathOperation math = new MathOperation();
        System.out.println(math.add(3, 45));
        System.out.println(math.add(5, 7, 9));
        System.out.println(math.multiply(8, 7));
    }
}
