import java.io.IOException;
import java.net.ServerSocket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReverseServer {
    public static void main(String[] args) throws IOException {
        int port = 8001;

        try (var serverSocket = new ServerSocket(port)) {
            System.out.println("The server is listening on port " + port);
            while (true) {
                try(var socket = serverSocket.accept()) {
                    System.out.println("client connected");

                    try(var reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                        var writer = new PrintWriter(socket.getOutputStream(), true);
                        String text;

                        do {
                            text = reader.readLine();
                            if(text != null){
                                var reversed = new StringBuilder(text).reverse().toString();
                                writer.println("Server: " + reversed);

                                System.out.println(text);
                            }
                        } while ("bye".equals(text));

                        System.out.println("client disconnected");
                    }
                }
            }
        }
    }
}
