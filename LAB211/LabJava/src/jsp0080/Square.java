package jsp0080;

/**
 * @date Jun 17, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Square extends TwoDimensional{
    
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }
    
    
    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square" + "\n\tSide = " + side + "\n\tArea = " + getArea();
    }

    
}
