package exercise1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * @date Jul 9, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Demo1 {
    public static void main(String[] args) throws MalformedURLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter URL: ");
        URL auUrl = new URL(scanner.nextLine());
        System.out.println("Protocol = " + auUrl.getProtocol());
        System.out.println("Authority = " + auUrl.getAuthority());
        System.out.println("Host = "+ auUrl.getHost());
        System.out.println("Port = " + auUrl.getPort());
        System.out.println("Path = " + auUrl.getPath());
        System.out.println("Query = " + auUrl.getQuery());
        System.out.println("File name = " + auUrl.getFile());
        System.out.println("Ref = " + auUrl.getRef());
    }
}
