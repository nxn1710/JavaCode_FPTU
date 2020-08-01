package basicsort;

/**
 * @date Jul 27, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Test {

    public static int gg(int x, int y) {
 if (x > y) return -1;

    else if (x == y) return 1;

    return x * gg(x +1, y);
    }
    public static void main(String[] args) {
        System.out.println(gg(4, 7));
    }
}
