package assignment;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * @date Mar 16, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        String code;
        String title;
        double price;
        String transport;
        Date startDate;
        Date endDate;
        double guideTrip;
        double aviationTax;
        double entryFee;
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        TourList tourList = new TourList();
        Scanner scanner = new Scanner(System.in);
        int choice, menu;
        do {
            System.out.println("--------------------------------MENU--------------------------------");
            System.out.println("1. Add new tours to the list");
            System.out.println("2. List all tours in the system");
            System.out.println("3. Compute the average tour charge of all tours");
            System.out.println("4. Search tour");
            System.out.println("5. Remove the tour");
            System.out.println("6. Sort all tours of list by multiple levels");
            System.out.println("7. Update tour information");
            System.out.println("8. Save/ Load tours to/ from file");
            System.out.println("0. Exit");
            System.out.print("Your Choice: ");
            menu = scanner.nextInt();
            scanner.nextLine();
            switch (menu) {
                case 1:
                    do {
                        System.out.println("-----ADD MANAGEMENT-----");
                        System.out.println("1. Add domestic tour");
                        System.out.println("2. Add Internation tour");
                        System.out.println("0. Exit");
                        System.out.print("Your choice: ");
                        choice = scanner.nextInt();
                        scanner.nextLine();
                        if (choice == 0) {
                            break;
                        }
                        System.out.print("Tour code: ");
                        code = scanner.nextLine();
                        System.out.print("Tour title: ");
                        title = scanner.nextLine();
                        System.out.print("Tour price: ");
                        price = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Tour transport: ");
                        transport = scanner.nextLine();
                        System.out.print("Tour start date: ");
                        startDate = format.parse(scanner.nextLine());
                        System.out.print("Tour end date: ");
                        endDate = format.parse(scanner.nextLine());
                        if (choice == 1) {
                            System.out.print("Tour guide trip: ");
                            guideTrip = scanner.nextDouble();
                            Domestic domestic = new Domestic(guideTrip, code, title, price, transport, startDate, endDate);
                            tourList.addTour(domestic);
                        }
                        if (choice == 2) {
                            System.out.print("Tour aviation tax: ");
                            aviationTax = scanner.nextDouble();
                            System.out.print("Tour entry fee: ");
                            entryFee = scanner.nextDouble();
                            International international = new International(aviationTax, entryFee, code, title, price,
                                    transport, startDate, endDate);
                            tourList.addTour(international);
                        }
                    } while (choice != 0);
                    break;
                case 2:
                    do {
                        System.out.println("-----LIST MANAGEMENT-----");
                        System.out.println("1. List domestic tour");
                        System.out.println("2. List Internation tour");
                        System.out.println("0. Exit");
                        System.out.print("Your choice: ");
                        choice = scanner.nextInt();
                        if (choice == 1) {
                            for (Tour i : tourList.domesticList()) {
                                System.out.println(i.toString());
                            }
                        }
                        if (choice == 2) {
                            for (Tour i : tourList.internationalList()) {
                                System.out.println(i.toString());
                            }
                        }
                    } while (choice != 0);
                    break;
                case 3:
                    do {
                        System.out.println("-----TOUR CHARGE MANAGEMENT-----");
                        System.out.println("1. Average domestic tour charge");
                        System.out.println("2. Average Internation tour charge");
                        System.out.println("0. Exit");
                        System.out.print("Your choice: ");
                        choice = scanner.nextInt();
                        if (choice == 1) {
                            System.out.println("Average domestic tour charge: " + tourList.avgDomesticTourCharge());
                        }
                        if (choice == 2) {
                            System.out.println("Average international tour charge: " + tourList.avgInterTourCharge());
                        }
                    } while (choice != 0);
                    break;
                case 4:
                    do {
                        System.out.println("-----SEARCH TOUR MANAGEMENT-----");
                        System.out.println("1. Search by Tour's Code");
                        System.out.println("2. Search by Tour's Title");
                        System.out.println("3. Search by Tour's Start Date");
                        System.out.println("4. Search by Tour's Transport");
                        System.out.println("5. Search the first occurrence of the tour having minimum tour charge");
                        System.out.println("0. Exit");
                        System.out.print("Your choice: ");
                        choice = scanner.nextInt();
                        scanner.nextLine();
                        if (choice == 1) {
                            System.out.print("Tour code: ");
                            code = scanner.nextLine();
                            if (tourList.searchCode(code) != null) {
                                System.out.println(tourList.searchCode(code).toString());
                            } else {
                                System.out.println("There is no tour code in the tour list");
                            }
                        }
                        if (choice == 2) {
                            System.out.print("Tour title: ");
                            title = scanner.nextLine();
                            if (!tourList.searchTitle(title).isEmpty()) {
                                for (Tour i : tourList.searchTitle(title)) {
                                    System.out.println(i.toString());
                                }
                            } else {
                                System.out.println("There is no tour title in the tour list");
                            }
                        }
                        if (choice == 3) {
                            System.out.print("Tour start date: ");
                            startDate = format.parse(scanner.nextLine());
                            if (!tourList.searchDate(startDate).isEmpty()) {
                                for (Tour i : tourList.searchDate(startDate)) {
                                    System.out.println(i.toString());
                                }
                            } else {
                                System.out.println("There is no tour start date in the tour list");
                            }
                        }
                        if (choice == 4) {
                            System.out.print("Tour transport: ");
                            transport = scanner.nextLine();
                            if (!tourList.searchTransport(transport).isEmpty()) {
                                for (Tour i : tourList.searchTransport(transport)) {
                                    System.out.println(i.toString());
                                }
                            } else {
                                System.out.println("There is no tour transport in the tour list");
                            }
                        }
                        if (choice == 5) {
                            double miniumTourCharge;
                            System.out.print("Minium Tour Charge: ");
                            miniumTourCharge = scanner.nextDouble();
                            if (tourList.searchMinTourCharge(miniumTourCharge) != null) {
                                System.out.println(tourList.searchMinTourCharge(miniumTourCharge).toString());
                            } else {
                                System.out.println("There is no of the tour having minimum tour charge");
                            }
                        }
                    } while (choice != 0);
                    break;
                case 5:
                    Date specificDate;
                    do {
                        System.out.println("-----REMOVE TOUR MANAGEMENT-----");
                        System.out.println("1. Remove by Tour's Code");
                        System.out.println("2. Remove by Specified Date");
                        System.out.println("0. Exit");
                        System.out.print("Your choice: ");
                        choice = scanner.nextInt();
                        scanner.nextLine();
                        if (choice == 1) {
                            System.out.println("Tour code: ");
                            code = scanner.nextLine();
                            tourList.removeCode(code);
                        }
                        if (choice == 2) {
                            System.out.println("Specific date: ");
                            specificDate = format.parse(scanner.nextLine());
                            tourList.removeDate(specificDate);
                        }
                    } while (choice != 0);
                    break;
                case 6:
                    tourList.sortByPrice();
                    tourList.sortByTitle();
                    System.out.println("Sort Successfully");
                    break;
                case 7:
                    System.out.println("UPDATE MANAGEMENT");
                    System.out.println("Tour code: ");
                    code = scanner.nextLine();
                    switch (tourList.check(code)) {
                        case 1:
                            System.out.print("Tour title: ");
                            title = scanner.nextLine();
                            System.out.print("Tour price: ");
                            price = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("Tour transport: ");
                            transport = scanner.nextLine();
                            System.out.print("Tour start date: ");
                            startDate = format.parse(scanner.nextLine());
                            System.out.print("Tour end date: ");
                            endDate = format.parse(scanner.nextLine());
                            System.out.print("Tour guide trip: ");
                            guideTrip = scanner.nextDouble();
                            tourList.update(guideTrip, code, title, price, transport, startDate, endDate);
                            break;
                        case 2:
                            System.out.print("Tour title: ");
                            title = scanner.nextLine();
                            System.out.print("Tour price: ");
                            price = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("Tour transport: ");
                            transport = scanner.nextLine();
                            System.out.print("Tour start date: ");
                            startDate = format.parse(scanner.nextLine());
                            System.out.print("Tour end date: ");
                            endDate = format.parse(scanner.nextLine());
                            System.out.print("Tour aviation tax: ");
                            aviationTax = scanner.nextDouble();
                            System.out.print("Tour entry fee: ");
                            entryFee = scanner.nextDouble();
                            tourList.update(aviationTax, entryFee, code, title, price, transport, startDate, endDate);
                            break;
                        case 0:
                            System.out.println("There is no tour code in tour list");
                            break;
                        default:
                            break;
                    }
                    break;
                case 8:
                    do {
                        System.out.println("-----SAVE AND LOAD MANAGEMENT------");
                        System.out.println("1. Save to File");
                        System.out.println("2. Load from File");
                        System.out.println("0. Exit");
                        System.out.print("Your choice: ");
                        choice = scanner.nextInt();
                        if (choice == 1) {
                            tourList.saveFile();
                            System.out.println("Save successfully");
                        }
                        if (choice == 2) {
                            tourList.loadFile();
                            System.out.println("Load successfully");
                        }
                    } while (choice != 0);
                    break;
            }
        } while (menu != 0);
    }

}
