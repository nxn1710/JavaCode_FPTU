package exercise2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @date Jul 9, 2020
 * @author Nguyen Xuan Nghiep
 */
public class ServiceThread extends Thread {

    private Scanner scanner = new Scanner(System.in);
    private Socket client;
    private int clientId;
    private BufferedReader br;
    private BufferedWriter bw;

    public ServiceThread(Socket client, int clientId) {
        this.clientId = clientId;
        this.client = client;
    }

    @Override
    public void run() {
        try {
            br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            bw = (new BufferedWriter(new OutputStreamWriter(client.getOutputStream())));
        } catch (IOException e) {
            System.out.println("Error");
        }
        while (true) {
            String receive = null;
            String mess = null;
            try {
                receive = br.readLine();
                if (receive.equalsIgnoreCase("Quit")) {
                    mess = "#server say: client " + clientId + " quit success";
                } else {
                    mess = "#client " + clientId + " say: " + receive;
                }
            } catch (IOException ex) {
            }
            if (receive != null) {
                System.out.println(mess);
                try {
                    bw.write(mess);
                    bw.newLine();
                    bw.flush();
                } catch (IOException e) {
                }
            }
            if (receive.equalsIgnoreCase("Quit")) {
                break;
            }
        }
    }
}
