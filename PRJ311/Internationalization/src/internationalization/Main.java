package internationalization;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * @date Jul 24, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    public static void main(String[] args) {
        ResourceBundle bundle;
        int lang;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. English");
        System.out.println("2. Vietnamese");
        System.out.println("3. Exit");
        do {
            lang = scanner.nextInt();
            switch (lang) {
                case 1:
                    bundle = ResourceBundle.getBundle("Language.Resource", Locale.US);
                    System.out.println(bundle.getString("greeting"));
                    break;
                case 2:
                    Locale.setDefault(new Locale("vi", "VN"));
                    bundle = ResourceBundle.getBundle("Language.Resource", Locale.getDefault());
                    System.out.println(bundle.getString("greeting"));
                    break;
                case 3:
                    break;

            }
        } while (lang != 3);
    }
}
