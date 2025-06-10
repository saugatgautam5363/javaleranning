import java.util.function.Function;

public class Function1 {
    public static void main(String[] args) {
        Function<Integer,Integer> doubleIt = x -> 2 * x;
        Function<Integer,Integer> tripleIt = x -> 3 * x;
        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        System.out.println(doubleIt.compose(tripleIt).apply(30));
        System.out.println(doubleIt.apply(100));

        Function<Integer,Integer> identity = Function.identity();
        Integer result = identity.apply(5);
        System.out.println(result);
    }
}
