class MathOperation{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class polomorphism {
    public static void main(String[] args) {
        MathOperation math = new MathOperation();
        System.out.println(math.add(2, 9));
        System.out.println(math.add(34, 56, 6));
    }
}
