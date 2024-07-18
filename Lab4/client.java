import java.net.*;
import java.io.*;

public class client {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost", 59090);
            DataOutputStream doutstr = new DataOutputStream(socket.getOutputStream());
            doutstr.writeUTF("Connected to Server");
            doutstr.flush();
            doutstr.close();
            socket.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
