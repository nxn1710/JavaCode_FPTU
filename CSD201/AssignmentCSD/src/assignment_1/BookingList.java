package assignment_1;

import java.io.Console;

/**
 * @date Jun 7, 2020
 * @author Nguyen Xuan Nghiep
 */
public class BookingList {

    static MyLinkedList<Booking> bookingsList = new MyLinkedList<>();

    public Booking input() {
        Booking booking = new Booking();
        Train train;
        String ccode = "", tcode;
        int seat = 0;
        do {
            //check code is exist in train list
            do {
                System.out.print("Enter train's code: ");
                tcode = Validation.checkInputString();
                if (TrainList.checktCodeExist(tcode)) {
                    System.err.println("Train code is not found in train list");
                }
            } while (TrainList.checktCodeExist(tcode));
            train = TrainList.searchByTCode(tcode);
            //check is available seat
            if (train.getSeat() == train.getBooker()) {
                System.err.println("Train is exhausted");
                System.out.print("Book another train? (Y/N): ");
                boolean check = Validation.checkInputYN();
                if (check) {
                    continue;
                } else {
                    break;
                }
            }
            //check code is exist in customer list
            do {
                System.out.print("Enter customer's code: ");
                ccode = Validation.checkInputString();
                if (CustomerList.checkcCodeExist(ccode)) {
                    System.err.println("Customer code is not found in train list");
                }
            } while (CustomerList.checkcCodeExist(ccode));
            //check the booking is exist in the booking list
            if (!checkExistBooking(tcode, ccode)) {
                System.out.println("This booking is exist in the list");
                continue;
            }
            do {
                System.out.print("Enter number of seat: ");
                seat = Validation.checkInputInt();
                if (seat > train.getSeat() - train.getBooker()) {
                    System.err.println("Number of seat available is " + (train.getSeat() - train.getBooker()));
                }
            } while (seat > train.getSeat() - train.getBooker());
            train.setBooker(train.getBooker() + seat);
        } while (!checkExistBooking(tcode, ccode) && train.getSeat() == train.getBooker()
                && seat > train.getSeat() - train.getBooker());
        booking.setTcode(tcode);
        booking.setCcode(ccode);
        booking.setSeat(seat);
        return booking;
    }

    public void addBooking() {
        bookingsList.addFirst(input());
        System.out.println("Add booking success");
    }

    public void sortByTCode() {
        int n = bookingsList.getSize();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (bookingsList.get(j).getTcode().compareTo(bookingsList.get(j + 1).getTcode()) > 0) {
                    bookingsList.swap(bookingsList.get(j), bookingsList.get(j + 1));
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (bookingsList.get(j).getCcode().compareTo(bookingsList.get(j + 1).getCcode()) > 0) {
                    bookingsList.swap(bookingsList.get(j), bookingsList.get(j + 1));
                }
            }
        }
    }

    public void display() {
        System.out.println("");
        System.out.println("--------------------------");
        System.out.printf("%9s|%12s|%4s\n", "Traincode", "Customercode", "Seat");
        for (Booking b : bookingsList) {
            System.out.printf("%-9s|%-12s|%-4s\n", b.getTcode(), b.getCcode(), b.getSeat());
        }
        System.out.println("--------------------------");
        System.out.println("");
    }

    public static boolean checkExistBooking(String tcode, String ccode) {
        for (Booking book : bookingsList) {
            if (tcode.equalsIgnoreCase(book.getTcode()) && ccode.equalsIgnoreCase(book.getCcode())) {
                return false;
            }
        }
        return true;
    }
}
