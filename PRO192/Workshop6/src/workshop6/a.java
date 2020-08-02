package workshop6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @date Mar 7, 2020
 * @author Nguyen Xuan Nghiep
 */
public class a {

    public static int main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        Scanner scanner = new Scanner(System.in);
        try {
            String s1;
            s1 = scanner.nextLine();
            Date d1 = sdf.parse(s1);
            return 1;
        } catch (ParseException e) {
            return -1;
        }
    }
}
