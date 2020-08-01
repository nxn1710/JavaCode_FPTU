package jsp0080;

/**
 * @date Jun 17, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Circle extends TwoDimensional {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle" + "\n\tRadius = " + radius + "\n\tArea = " + getArea();
    }
    
}
