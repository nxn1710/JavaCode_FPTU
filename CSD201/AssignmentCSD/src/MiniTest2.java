
/**
 * @date Jun 15, 2020
 * @author Nguyen Xuan Nghiep
 */
public class MiniTest2 {

    private static int GCD(int a, int b) {
        if (a == b) {
            return b;
        }
        if (a > b) {
            return GCD(a - b, b);
        }
        return GCD(a, b - a);
//        if (b == 0) {
//            return a;
//        }
//        return GCD(b, a % b);
    }

    private static int power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * power(a, b - 1);
    }

    private static int fact(int n) {
        if (n <= 1) {
            return n;
        }
        return n * fact(n - 1);
    }

    private static int fibo(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(GCD(98, 56));
        System.out.println(power(2, 4));
        System.out.println(fact(5));
        System.out.println(fibo(5));
    }

}
