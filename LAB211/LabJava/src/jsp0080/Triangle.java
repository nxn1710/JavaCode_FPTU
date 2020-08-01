package jsp0080;

/**
 * @date Jun 17, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Triangle extends TwoDimensional {

    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public String toString() {
        return "Triangle" + "\n\tSide1 = " + side1 + "\n\tSide2 = " + side2 + "\n\tSide3 = "
                + side3 + "\n\tArea = " + getArea();
    }

}
