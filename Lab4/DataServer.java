import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


public class DataServer {
    public static void main(String[] args) throws IOException {
        try(var listener = new ServerSocket(59090)) {
            System.out.println("The data server is running.....");
            while(true){
                try(var socket = listener.accept()) {
                    var out = new PrintWriter(socket.getOutputStream(), true);
                    System.out.println(new Date().toString());
                }
            }
        }
    }
}