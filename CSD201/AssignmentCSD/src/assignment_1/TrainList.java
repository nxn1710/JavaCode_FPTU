package assignment_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

/**
 * @date Jun 1, 2020
 * @author Nguyen Xuan Nghiep
 */
public class TrainList {

    static MyLinkedList<Train> trainList;

    public TrainList() {
        trainList = new MyLinkedList<>();
    }

    public void addtest() {
        trainList.addFirst(new Train("B03", "Sug", 12, 3, 11, "PA"));
        trainList.addFirst(new Train("B04", "Boo", 9, 5, 5, "PD"));
        trainList.addFirst(new Train("B01", "Mil", 10, 5, 5.7, "PC"));
        trainList.addFirst(new Train("B02", "App", 5, 2, 4, "PB"));
    }

    public Train input() {
        Train train = new Train();
        String code;
        do {
            System.out.print("Enter Train Code: ");
            code = Validation.checkInputString();
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
        trainList.addFirst(input());
        System.out.println("=> Add success");
    }

    public void sortByTCode() {
        int n = trainList.getSize();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (trainList.get(j).getTcode().compareTo(trainList.get(j + 1).getTcode()) > 0) {
                    trainList.swap(trainList.get(j), trainList.get(j + 1));
                }
            }
        }
        System.out.println("=> Sort Success");
    }

    public void display() {
        System.out.println("");
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("%5s|%10s|%4s|%6s|%11s|%12s|%14s\n", "tcode", "Train_name", "Seat", "booked",
                "depart_time", "depart_place", "available_seat");
        System.out.println("-------------------------------------------------------------------");
        for (Train a : trainList) {
            System.out.printf("%-5s|", a.getTcode());
            System.out.printf("%-10s|", a.getTrainName());
            System.out.printf("%-4s|", a.getSeat());
            System.out.printf("%-6s|", a.getBooker());
            System.out.printf("%-11s|", a.getDepartTime());
            System.out.printf("%-12s|", a.getDepartPlace());
            System.out.printf("%-14s", a.getSeat() - a.getBooker());
            System.out.println("");
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println("");
    }

    public void deleteByTCode() {
        System.out.print("Enter train code to delete: ");
        String tcode = Validation.checkInputString();
        for (Train t : trainList) {
            if (tcode.equalsIgnoreCase(t.getTcode())) {
                trainList.deleteNode(t);
                System.out.println("=> Delete success");
                return;
            }
        }
        System.out.println("Dont have this train in list");
    }

    public void searchByTCode() {
        System.out.print("Enter train code to search: ");
        String tcode = Validation.checkInputString();
        for (Train t : trainList) {
            if (tcode.equalsIgnoreCase(t.getTcode())) {
                System.out.println(t.toString());
                return;
            }
        }
        System.out.println("Dont have this train in list");
    }

    public static Train searchByTCode(String tcode) {
        for (Train t : trainList) {
            if (tcode.equalsIgnoreCase(t.getTcode())) {
                return t;
            }
        }
        return null;
    }

    public void saveToFile() throws FileNotFoundException {
        //save object to binary file
        try {
            FileOutputStream fos = new FileOutputStream("train.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(trainList);
            oos.close();
        } catch (Exception e) {
        }

        //save file text view
        PrintWriter pw = new PrintWriter(new FileOutputStream("train.txt"));
        for (Train t : trainList) {
            String tmp = t.toString();
            pw.write(tmp);
        }
        pw.close();
        System.out.println("=> Save success");
    }

    public void loadFromFile() {
        //load from binary file
        try {
            FileInputStream fis = new FileInputStream("train.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            trainList = (MyLinkedList) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            System.out.println("Dont have this file");
        }
        System.out.println("=> Load success");
    }

    public void deleteBeforeTrain() {
        String tcode;
        System.out.print("Enter train code: ");
        tcode = Validation.checkInputString();
        for (Train t : trainList) {
            if (tcode.equalsIgnoreCase(t.getTcode())) {
                trainList.deleteBeforeNode(t);
            }
        }
        System.out.println("=> Delete sucess");
    }

    public void addAfterPosition() {
        int k;
        System.out.print("Enter position to add: ");
        k = Validation.checkInputPositiveInt();
        trainList.addAfterPosition(k, input());
        System.out.println("=> Add sucess");
    }
    //check id exist

    public static boolean checktCodeExist(String tcode) {
        for (Train train : trainList) {
            if (tcode.equalsIgnoreCase(train.getTcode())) {
                return false;
            }
        }
        return true;
    }
}
