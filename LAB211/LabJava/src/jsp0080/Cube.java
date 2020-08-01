package jsp0080;

/**
 * @date Jun 17, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Cube extends ThreeDimensional {

    private double side;

    public Cube() {
    }

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * side * side;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }

    @Override
    public String toString() {
        return "Cube\n" + "\tSide = " + side + "\n\tArea = " + getArea() + "\n\tVolume = " + getVolume();
    }
    
}
