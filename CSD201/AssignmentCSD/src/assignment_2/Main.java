package assignment_2;

import java.io.FileNotFoundException;

/**
 * @date Jul 1, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    public static void main(String[] args) {
        int choice, choice1;
        TrainList trains = new TrainList();
        CustomerList customers = new CustomerList();
        BookingList bookings = new BookingList();
//        trains.addtest();
//        customers.addTest();
        do {
            choice = Menu.Main();
            switch (choice) {
                case 1:
                    do {
                        choice1 = Menu.Train();
                        switch (choice1) {
                            case 1:
                                trains.loadFromFile();
                                break;
                            case 2:
                                trains.addTrain();
                                break;
                            case 3:
                                trains.displayInorder();
                                break;
                            case 4:
                                trains.displayBreadth();
                                break;
                            case 5:
                                trains.saveToFile();
                                break;
                            case 6:
                                trains.searchByTCode();
                                break;
                            case 7:
                                trains.deleteByTcode();
                                break;
                            case 8:
                                trains.balance();
                                break;
                            case 9:
                                trains.getNumberOfTrain();
                                break;
                        }
                    } while (choice1 != 0);
                    break;
                case 2:
                    do {
                        choice1 = assignment_1.Menu.Customer();
                        switch (choice1) {
                            case 1:
                                customers.loadFromFile();
                                break;
                            case 2:
                                customers.addCustomer();
                                break;
                            case 3:
                                customers.display();
                                break;
                            case 4: {
                                try {
                                    customers.saveToFile();
                                } catch (FileNotFoundException ex) {
                                }
                            }
                            break;
                            case 5:
                                customers.searchByCCode();
                                break;
                            case 6:
                                customers.deleteByCCode();
                                break;
                        }
                    } while (choice1 != 0);
                    break;
                case 3:
                    do {
                        choice1 = assignment_1.Menu.Booking();
                        switch (choice1) {
                            case 1:
                                bookings.addBooking();
                                break;
                            case 2:
                                bookings.display();
                                break;
                            case 3:
                                bookings.sortByTCode();
                                break;
                        }
                    } while (choice1 != 0);
                    break;
                case 4:
                    break;
            }
        } while (choice != 0);
    }
}
