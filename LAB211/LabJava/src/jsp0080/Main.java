package jsp0080;

import java.util.ArrayList;

/**
 * @date Jun 17, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> listShape = new ArrayList<>();
        listShape.add(new Cube(6));
        listShape.add(new Circle(5));
        listShape.add(new Sphere(4));
        listShape.add(new Tetrahedron(4));
        
        listShape.forEach(s -> {
            System.out.println(s.toString());
            System.out.println("===============");
        });
    }
}
