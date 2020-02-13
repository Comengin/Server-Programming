import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(8000);
        System.out.println("Server is starting!");
        System.out.println("Waiting for clients...");
        while(true) {
            Socket server = ss.accept();
            System.out.println("Client connected");
            SimpleServer simpleServer = new SimpleServer(server);
            simpleServer.start();
        }
    }
}