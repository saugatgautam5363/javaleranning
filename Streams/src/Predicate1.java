import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x-> x % 2 ==0;
        System.out.println(isEven.test(4));

        Predicate<String> sentenceStateWithS = x -> x.startsWith("S");
        Predicate<String> sentenceEndWitht = x -> x.endsWith("t");
        Predicate<String> and = sentenceStateWithS.and(sentenceEndWitht);
        System.out.println(and.test("Saugat"));
        System.out.println(sentenceStateWithS.test("Saugat"));
    }
}
