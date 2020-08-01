package socket;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * @date Jun 26, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Server {
    public static void main(String[] args) {
        ServerSocket sc = null;
        try {
            sc = new ServerSocket(1710);
            System.out.println("Server is waiting for connect");
        } catch (Exception e) {
        }
        while (true) {
            Socket a = null;
            try {
                a = sc.accept();
                System.out.println("New client connected");
                OutputStream output = a.getOutputStream();
                PrintWriter print = new PrintWriter(output);
                print.write(new Date().toString());
                print.close();
            } catch (Exception e) {
            }
        }
    }
}
