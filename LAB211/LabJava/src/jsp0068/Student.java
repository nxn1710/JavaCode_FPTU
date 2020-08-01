package jsp0068;

/**
 * @date Jun 23, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Student {

    private String name;
    private float mark;
    private String classes;

    public Student() {
    }

    public Student(String name, float mark, String classes) {
        this.name = name;
        this.mark = mark;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nClasses: " + classes + "\nMark: " + mark;
    }

}
