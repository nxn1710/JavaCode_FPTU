package jsp0080;

/**
 * @date Jun 17, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Sphere extends ThreeDimensional {

    private int radius;

    public Sphere() {
    }

    public Sphere(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return (4/3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere\n" + "\tRadius = " + radius + "\n\tArea = " + getArea() + "\n\tVolume = " + getVolume();
    }
    
    

}
