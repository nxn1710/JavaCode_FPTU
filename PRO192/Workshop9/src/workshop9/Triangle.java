package workshop9;

/**
 * @date Mar 22, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Triangle {

    private int a, b, c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) throws IllegalTriangleException, IllegalRightTriangleException {
        if (a + b < c || b + c < a || c + a < b) {
            throw new IllegalTriangleException("This is not a triangle");
        } else if (!(a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b)) {
            throw new IllegalRightTriangleException("This is not a right triangle");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    boolean checkRightTriangle(int a, int b, int c) {
        return a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b;
    }
}
