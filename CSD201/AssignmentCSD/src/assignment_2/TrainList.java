package assignment_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @date Jul 1, 2020
 * @author Nguyen Xuan Nghiep
 */
public class TrainList {

    static MyBinaryTree mbt;

    public TrainList() {
        mbt = new MyBinaryTree();
    }

    public void addtest() {
        mbt.addToTree(new Train("B03", "Sug", 12, 3, 11, "PA"));
        mbt.addToTree(new Train("B04", "Boo", 9, 5, 5, "PD"));
        mbt.addToTree(new Train("B01", "Mil", 10, 5, 5.7, "PC"));
        mbt.addToTree(new Train("B02", "App", 5, 2, 4, "PB"));
        mbt.addToTree(new Train("B05" ,"Roo" , 7 , 6 , 15   ,"PE"));
    }

    public Train input() {
        Train train = new Train();
        String code;
        do {
            System.out.print("Enter Train Code: ");
            code = Validation.checkInputTCode();
            if (!checktCodeExist(code)) {
                System.err.println("Train code is exist in list");
            }
        } while (!checktCodeExist(code));
        train.setTcode(code);
        System.out.print("Enter Train Name: ");
        train.setTrainName(Validation.checkInputString());
        System.out.print("Enter number of seat: ");
        train.setSeat(Validation.checkInputPositiveInt());
        //number of booker must be <= number of seat
        System.out.print("Enter number of booker: ");
        train.setBooker(Validation.checkInputIntLimit(0, train.getSeat()));
        System.out.print("Enter depart time: ");
        train.setDepartTime(Validation.checkInputDouble());
        System.out.print("Enter depart place: ");
        train.setDepartPlace(Validation.checkInputString());
        return train;
    }

    public void addTrain() {
        mbt.addToTree(input());
    }

    public void saveToFile() {
        try {
            FileOutputStream fos = new FileOutputStream("train.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(mbt);
            oos.close();
        } catch (IOException e) {
        }

    }

    public void loadFromFile() {
        try {
            FileInputStream fis = new FileInputStream("train.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            mbt = (MyBinaryTree) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
        }
    }

    boolean checktCodeExist(String code) {
        return mbt.search(mbt.getRoot(), code) == null;
    }

    public void getNumberOfTrain() {
        System.out.println("Number of train in train list is: " + mbt.countNode(mbt.getRoot()));
    }

    public void displayBreadth() {
        mbt.breadthTraverse();
    }

    public void balance() {
        Train[] trains = mbt.sort();
        mbt.clear();
        mbt.simplyBalance(trains, 0, trains.length - 1);
    }

    public void displayInorder() {
        mbt.inOrder(mbt.getRoot());
    }

    public void deleteByTcode() {
        System.out.print("Enter train code to delete: ");
        String tcode = Validation.checkInputString();
        mbt.delete(tcode);
    }

    public void searchByTCode() {
        System.out.print("Enter train code to search: ");
        String tcode = Validation.checkInputString();
        Train train = mbt.search(mbt.getRoot(), tcode);
        if (train == null) {
            System.err.println("Dont have that train in list");
        } else {
            System.out.println(train.toString());
        }
    }

    public static Train searchByTCode(String tcode) {
        Train train = mbt.search(mbt.getRoot(), tcode);
        return train;
    }
}
