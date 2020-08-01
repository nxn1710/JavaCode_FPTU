package assignment_1;

import java.io.FileNotFoundException;

/**
 * @date Jun 6, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        int choice, choice1;
        TrainList train = new TrainList();
//        train.addtest();
        CustomerList customer = new CustomerList();
//        customer.addTest();
        BookingList booking = new BookingList();
        do {
            choice = Menu.Main();
            switch (choice) {
                case 1:
                    do {
                        choice1 = Menu.Train();
                        switch (choice1) {
                            case 1:
                                train.loadFromFile();
                                break;
                            case 2:
                                train.addTrain();
                                break;
                            case 3:
                                train.display();
                                break;
                            case 4:
                                train.saveToFile();
                                break;
                            case 5:
                                train.searchByTCode();
                                break;
                            case 6:
                                train.deleteByTCode();
                                break;
                            case 7:
                                train.sortByTCode();
                                break;
                            case 8:
                                train.addAfterPosition();
                                break;
                            case 9:
                                train.deleteBeforeTrain();
                                break;
                        }
                    } while (choice1 != 0);
                    break;
                case 2:
                    do {
                        choice1 = Menu.Customer();
                        switch (choice1) {
                            case 1:
                                customer.loadFromFile();
                                break;
                            case 2:
                                customer.addCustomer();
                                break;
                            case 3:
                                customer.display();
                                break;
                            case 4:
                                customer.saveToFile();
                                break;
                            case 5:
                                customer.searchByCCode();
                                break;
                            case 6:
                                customer.deleteByCCode();
                                break;
                        }
                    } while (choice1 != 0);
                    break;
                case 3:
                    do {
                        choice1 = Menu.Booking();
                        switch (choice1) {
                            case 1:
                                booking.addBooking();
                                break;
                            case 2:
                                booking.display();
                                break;
                            case 3:
                                booking.sortByTCode();
                                break;
                        }
                    } while (choice1 != 0);
                    break;
                case 4:
                    break;
            }
        } while (choice != 4);
    }
}
