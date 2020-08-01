package jsp0052;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @date Jul 15, 2020
 * @author Nguyen Xuan Nghiep
 */
public class ManageEastAsiaCountries {

    public ArrayList<EastAsiaCountries> list;
    private static Scanner scanner = new Scanner(System.in);

    public ManageEastAsiaCountries() {
        list = new ArrayList<>();
    }

    public void add() {
        EastAsiaCountries eac = new EastAsiaCountries();
        System.out.print("Enter code of country: ");
        eac.setCountryCode(Validation.checkInputString());
        System.out.print("Enter name of country: ");
        eac.setCountryName(Validation.checkInputString());
        System.out.print("Enter total Area: ");
        eac.setTotalArea(Validation.checkInputFloat());
        System.out.print("Enter terrain of country:");
        eac.setCountryTerrain(Validation.checkInputString());
        list.add(eac);
    }

    public void display() {
        System.out.printf("%-20s%-20s%-20s%-10s\n", "ID", "Name", "Total Area", "Terrain");
        System.out.println(list.get(list.size() - 1));
    }

    public void search() {
        System.out.print("Enter name of country: ");
        String name = Validation.checkInputString();
        System.out.printf("%-20s%-20s%-20s%-10s\n", "ID", "Name", "Total Area", "Terrain");
        for (EastAsiaCountries eac : list) {
            if (eac.getCountryName().equalsIgnoreCase(name)) {
                System.out.println(eac.toString());
            }
        }
    }
    
    public void displaySortName() {
        ArrayList sorted = list;
        sorted.sort(new Comparator<EastAsiaCountries>() {
            @Override
            public int compare(EastAsiaCountries o1, EastAsiaCountries o2) {
                return o1.getCountryName().compareTo(o2.getCountryName());
            }
        });
        list.forEach((c) -> {
            System.out.println(c.toString());
        });
    }

}
