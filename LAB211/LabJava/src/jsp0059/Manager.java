package jsp0059;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @date Jul 15, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Manager {

    File sourceFile;
    File fileCopy;
    ArrayList<Person> list;
    BufferedReader br;
    BufferedWriter bw;

    public Manager() {
    }

    public void readFile(String filePath) throws IOException {
        sourceFile = new File(filePath);
        br = new BufferedReader(new FileReader(sourceFile));
        list = new ArrayList<>();
        String tmp = "";
        while ((tmp = br.readLine()) != null) {
            String[] data = tmp.split(";");
            double money;
            try {
                money = Double.parseDouble(data[2]);
            } catch (NumberFormatException ex) {
                money = 0;
            }
            Person p = new Person(data[0], data[1], money);
            list.add(p);
        }
        br.close();
    }

    public void getInfo(double amount) {
        list.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return (int) (o1.getMoney() - o2.getMoney());
            }

        });
        System.out.println("----------Result-----");
        System.out.printf("%-15s%-15s%-15s\n", "Name", "Address", "Money");
        int indexMin = list.size() - 1, indexMax = 0;
        boolean check = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMoney() >= amount) {
                if (list.get(indexMin).getMoney() > list.get(i).getMoney()) {
                    indexMin = i;
                } else if (list.get(indexMax).getMoney() <= list.get(i).getMoney()) {
                    indexMax = i;
                }
                System.out.println(list.get(i).toString());
                check = true;
            }
        }
        if (check) {
            String minPerson = "", maxPerson = "";
            for (Person p : list) {
                if (p.getMoney() == list.get(indexMin).getMoney()) {
                    minPerson += p.getName() + ", ";
                } else if (p.getMoney() == list.get(indexMax).getMoney()) {
                    maxPerson += p.getName() + ", ";
                }
            }
            System.out.println("Min: " + minPerson.substring(0, minPerson.length() - 2));
            System.out.println("Max: " + maxPerson.substring(0, maxPerson.length() - 2));
        } else {
            System.out.println("No any person was found");
        }
    }

    public void copyFile(String filePathSource, String filePathCopy) throws FileNotFoundException, IOException {
        HashMap<String, Boolean> listWord = new HashMap<>();
        File source = new File(filePathSource);
        File copy = new File(filePathCopy);
        br = new BufferedReader(new FileReader(source));
        bw = new BufferedWriter(new FileWriter(copy));
        String str;
        while ((str = br.readLine()) != null) {
            String[] words = str.split(" ");
            for (String w : words) {
                if (listWord.containsKey(w)) {
                    listWord.replace(w, listWord.get(w), false);
                } else {
                    listWord.put(w, true);
                }
            }
        }
        br.close();
        Set<String> key = listWord.keySet();
        Iterator it = key.iterator();
        while (it.hasNext()) {
            String word = (String) it.next();
            if (listWord.get(word)) {
                bw.write(word);
                bw.write(" ");
            }
        }
        bw.close();
    }

}
