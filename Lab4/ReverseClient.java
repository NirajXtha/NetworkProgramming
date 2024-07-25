import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ReverseClient {
    public static void main(String[] args) throws Exception{
        var hostName = "localhost";
        int port = 8001;

        try(var socket = new Socket(hostName, port)) {
            try(var writer = new PrintWriter(socket.getOutputStream(), true)) {
                try(var scanner = new Scanner(System.in)) {
                    try(var reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                        String command;

                        do {
                            System.out.println("Enter command: ");
                            command = scanner.nextLine();
                            writer.println(command);
                            var data = reader.readLine();
                            System.out.println(data);
                        } while (!command.equals("bye"));
                    } 
                } 
            } 
        } 
    }
}
