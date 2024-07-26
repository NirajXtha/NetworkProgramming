// Important: The port number must be below 65535

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class LowPortScanner {
    public static void main(String[] args) {
        String host = args.length > 0 ? args[0] : "localhost";
        for(int i = 1; i < 65535; i++) {
            try {
                Socket s = new Socket(host, i);
                System.out.println("There is a server on port " + i + " of " + host);
                s.close();
            } catch (UnknownHostException e) {
                System.err.println(e);
                break;
            }catch(IOException e){
                //must not be a server on this port
            }
        }
    }
}
