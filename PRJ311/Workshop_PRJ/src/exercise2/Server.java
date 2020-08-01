package exercise2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * @date Jul 9, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Server {

    private ServerSocket serverSocket;
    private Socket client;
    private int clientId = 0;

    public Server(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        System.out.println("Server is opening. Waiting for connect");
    }

    public void execute() {
        try {
            while (true) {
                client = serverSocket.accept();
                ServiceThread service = new ServiceThread(client, clientId);
                System.err.println("Client " + clientId + " connected");
                clientId++;
                service.start();
            }
        } catch (IOException ex) {
        }
    }

    public static void main(String[] args) throws IOException {
        Server server = new Server(1710);
        server.execute();
    }
}
