
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;




/**
 * @date Mar 7, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Newclass {
    public static void main(String[] args) throws ParseException {
        Date date;
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        Scanner scanner = new Scanner(System.in);
            date = dateFormat.parse(scanner.nextLine());
        System.out.println(dateFormat.format(date));
    }
}
