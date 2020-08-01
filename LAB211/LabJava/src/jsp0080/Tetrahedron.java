package jsp0080;

/**
 * @date Jun 17, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Tetrahedron extends ThreeDimensional {

    private double side;

    public Tetrahedron() {
    }

    public Tetrahedron(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * side * side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3) / (6 * Math.sqrt(2));
    }

    @Override
    public String toString() {
        return "Tetrahedron\n" + "\tSide = " + side + "\n\tArea = " + getArea() + "\n\tVolume = " + getVolume();
    }

}
