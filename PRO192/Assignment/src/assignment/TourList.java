package assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 * @date Mar 15, 2020
 * @author Nguyen Xuan Nghiep
 */
public class TourList {

    ArrayList<Tour> list = new ArrayList<>();
    String file = "dataTour.dat";

    public void addTour(Tour tour) {
        list.add(tour);
    }

    public ArrayList<Tour> domesticList() {
        ArrayList<Tour> domesticList = new ArrayList<>();
        for (Tour i : list) {
            if (i instanceof Domestic) {
                domesticList.add(i);
            }
        }
        return domesticList;
    }

    public ArrayList<Tour> internationalList() {
        ArrayList<Tour> internationalList = new ArrayList<>();
        for (Tour i : list) {
            if (i instanceof International) {
                internationalList.add(i);
            }
        }
        return internationalList;
    }

    public double avgInterTourCharge() {
        double count = 0;
        double sum = 0;
        for (Tour i : list) {
            if (i instanceof International) {
                count += 1;
                sum += i.tourCharge();
            }
        }
        return sum / count;
    }

    public double avgDomesticTourCharge() {
        int count = 0;
        double sum = 0;
        for (Tour i : list) {
            if (i instanceof Domestic) {
                count++;
                sum += i.tourCharge();
            }
        }
        return (double) (sum / count);
    }

    public Tour searchCode(String code) {
        for (Tour i : list) {
            if (code.equals(i.getCode())) {
                return i;
            }
        }
        return null;
    }

    public ArrayList<Tour> searchTitle(String title) {
        ArrayList<Tour> titleList = new ArrayList<>();
        for (Tour i : list) {
            if (title.equals(i.getTitle())) {
                titleList.add(i);
            }
        }
        return titleList;
    }

    public ArrayList<Tour> searchDate(Date specificDate) {
        ArrayList<Tour> transportList = new ArrayList<>();
        for (Tour i : list) {
            if (specificDate.compareTo(i.getStartDate()) == 0) {
                transportList.add(i);
            }
        }
        return transportList;
    }

    public ArrayList<Tour> searchTransport(String transport) {
        ArrayList<Tour> transportList = new ArrayList<>();
        for (Tour i : list) {
            if (transport.equals(i.getTransport())) {
                transportList.add(i);
            }
        }
        return transportList;
    }

    public Tour searchMinTourCharge(double minTourCharge) {
        for (Tour i : list) {
            if (minTourCharge <= i.tourCharge()) {
                return i;
            }
        }
        return null;
    }

    public void removeCode(String code) {
        for (Tour i : list) {
            if (code.equals(i.getCode())) {
                list.remove(i);
            }
        }
    }

    public void removeDate(Date date) {
        for (Tour i : list) {
            if (date.compareTo(i.getStartDate()) >= 0) {
                list.remove(i);
            }
        }
    }

    public int check(String code) {
        for (Tour i : list) {
            if (code.equals(i.getCode())) {
                if (i instanceof Domestic) {
                    return 1;
                } else if (i instanceof International) {
                    return 2;
                }
            }
        }
        return 0;
    }

    //update domestic
    public void update(double guideTrip, String code, String title, double price, String transport,
            Date startDate, Date endDate) {
        for (Tour i : list) {
            if (code.equals(i.getCode())) {
                ((Domestic) i).setGuideTrip(guideTrip);
                i.setTitle(title);
                i.setPrice(price);
                i.setTransport(transport);
                i.setStartDate(startDate);
                i.setEndDate(endDate);
            }
        }
    }

    //update international
    public void update(double aviationTax, double entryFee, String code, String title, double price,
            String transport, Date startDate, Date endDate) {
        for (Tour i : list) {
            if (code.equals(i.getCode())) {
                ((International) i).setAviationTax(aviationTax);
                ((International) i).setEntryFee(entryFee);
                i.setTitle(title);
                i.setPrice(price);
                i.setTransport(transport);
                i.setStartDate(startDate);
                i.setEndDate(endDate);
            }
        }
    }

    public void sortByTitle() {

        Collections.sort(list, new Comparator<Tour>() {
            @Override
            public int compare(Tour o1, Tour o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });

    }

    public void sortByPrice() {

        Collections.sort(list, new Comparator<Tour>() {
            @Override
            public int compare(Tour o1, Tour o2) {
                double res = o1.getPrice() - o2.getPrice();
                if (res > 0) {
                    return -1; //no swap
                } else if (res < 0) {
                    return 1; // swap
                }
                return 0;
            }
        });
    }

    public void saveFile() {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        } catch (IOException ex) {
        }
    }

    public void loadFile() {
        try {
            FileInputStream filein = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(filein);
            list = (ArrayList<Tour>) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
        }
    }

}
