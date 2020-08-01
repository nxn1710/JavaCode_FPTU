package thread;

import java.math.BigDecimal;

/**
 * @date Jun 19, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    static String[] fractionDecimal(int T, int[][] arr_testcase) {
        String[] result = new String[T];
        for (int i = 0; i < T; i++) {
            BigDecimal a = new BigDecimal((double) arr_testcase[i][0] / arr_testcase[i][1]);
            String string = a.toString();
            int indexDot = string.indexOf('.');
            result[i] = getString(indexDot, arr_testcase[i][2], string);
        }
        return result;
    }

    static String getString(int a, int num, String g) {
        int lengt = g.length();
        if (lengt < a + num + 1) {
            for (int i = 0; i < a +num+2; i++) {
                g += '0';
            }
        }
        return g.substring(0, a + num + 1);
    }

    public static void main(String[] args) {
//        ThreadA a = new ThreadA();
//        
//        ThreadB b = new ThreadB();
//        Thread c = new Thread(b);
//        a.start();
//        c.start();

        int[][] arr = {{1, 3, 4}, {9,35,25}};
        String[] s = fractionDecimal(2, arr);
        for (String a : s) {
            System.out.println(a);
        }
        System.out.println("0.2571428571428571428571428");
        BigDecimal a = new BigDecimal((double)9/35);
            
//            Double res = ;
//            String string = Double.toString(res);
            System.out.println(Double.toString(a.doubleValue()));
    }
}
