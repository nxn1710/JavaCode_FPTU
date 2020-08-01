package jsp0065;

/**
 * @date Jul 7, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Student {

    private String name;
    private String classes;
    private double maths;
    private double physics;
    private double chemistry;
    private double avg;
    private String type;

    public Student() {
    }

    public Student(String name, String classes, double maths, double physics, double chemistry, double avg, String type) {
        this.name = name;
        this.classes = classes;
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
        this.avg = avg;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getMaths() {
        return maths;
    }

    public void setMaths(double maths) {
        this.maths = maths;
    }

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
