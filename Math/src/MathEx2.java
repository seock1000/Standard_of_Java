import static java.lang.System.*;
import static java.lang.Math.*;

public class MathEx2 {
    public static void main(String[] args) {
        int i = Integer.MIN_VALUE;

        out.println("i = " + i);
        out.println("-i = " + -i);

        try {
            out.printf("negateExact(%d)=%d%n", 10, negateExact(10));
            out.printf("negateExact(%d)=%d%n", -10, negateExact(-10));
            out.printf("negateExact(%d)=%d%n", i, negateExact(i)); // 예외 발생
        } catch (ArithmeticException e) {
            // i를 long으로 변환 후 negateExact() 호출
            out.printf("negateExact(%d)=%d%n", (long)i, negateExact((long)i));
        }
    }
}
