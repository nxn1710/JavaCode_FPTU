package workshop8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @date Mar 14, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Student {

    private String name;
    private int age;
    private double mark;

    public Student() {
    }

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Mark: " + mark + '\n';
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int choice, i = 0;
        String name;
        int age;
        double mark;
        File file = new File("src\\question2\\infomation.txt");
        Student student = new Student();
        do {
            System.out.println("MENU");
            System.out.println("_________________________________________");
            System.out.println("1. Add a list of Students and save to File");
            System.out.println("2. Loading list of Students from a File");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
                    System.out.print("Enter Name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    age = scanner.nextInt();
                    System.out.print("Enter Mark: ");
                    mark = scanner.nextDouble();
                    student = new Student(name, age, mark);
                    bw.append(student.toString());
                    bw.close();
                    break;
                case 2:
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    String line;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                    br.close();
                    break;
                case 3:
                    break;
            }
        } while (choice != 3);
    }
}
