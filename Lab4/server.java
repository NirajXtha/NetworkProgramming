import java.net.*;
import java.io.*;

public class server {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(59090);
            Socket socket = server.accept();
            DataInputStream dinpstr = new DataInputStream(socket.getInputStream());
            String st = (String) dinpstr.readUTF();
            System.out.println("Message: " + st);
            server.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
