package question1;

/**
 * @date Feb 21, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Triangle {

    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public boolean checkTriangle() {
        if (a + b > c ) {
            if (a + c > b) {
                if (b + c > a) {
                    return true;
                }
            }
        }
        return false;
    }

    public int perimeter() {
        return a + b + c;
    }

    public float area() {
        return (float) Math.sqrt((a + b + c) * (a + b - c) * (b + c - a) * (c + a - b)) / 4;
    }

    public void kindTriangle() {
        if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
            if (a == b || a == c || b == c) {
                System.out.println("This is an isosceles right triangle");
            } else {
                System.out.println("This is a right triangle");
            }
        } else if (a == b && b == c && a == c) {
            System.out.println("This is an equilateral triangle");
        } else if (a == b || a == c || b == c) {
            System.out.println("This is an isosceles triangle");
        } else {
            System.out.println("This is a scalene triangle");
        }
    }
}
