package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @date Jun 26, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Client {
    public static void main(String[] args) {
        Socket sc = null;
        try {
            sc = new Socket("localhost", 1710);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            InputStream is = sc.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String time = br.readLine();
            System.out.println(time);
        } catch (Exception e) {
        }
    }
}
