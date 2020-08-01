package exercise2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @date Jul 8, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Client {

    private Scanner scanner = new Scanner(System.in);
    private Socket socket;
    private BufferedReader br;
    private BufferedWriter bw;

    public Client() {
    }

    public Client(String host, int port) throws IOException {
        this.socket = new Socket(host, port);
    }

    public void execute() {
        try {
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
        }
        while (true) {
            String sm1, sm2 = null;
            System.out.print("Enter chat: ");
            sm1 = scanner.next();
            try {
                bw.write(sm1);
                bw.newLine();
                bw.flush();
                sm2 = br.readLine();
            } catch (IOException ex) {
            }
            System.out.println(sm2);
            if (sm1.equalsIgnoreCase("Quit")) {
                break;
            }
        }
        try {
            br.close();
            bw.close();
            socket.close();
        } catch (IOException ex) {
        }

    }

    public static void main(String[] args) throws IOException {
        Client client = new Client("localhost", 1710);
        client.execute();
    }
}
