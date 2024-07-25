import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class URLConnectionExample {
    public static void main(String[] args) {
        try {
            // Step 1: Create a URL object
            URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");

            // Step 2: Open a connection to the URL
            URLConnection connection = url.openConnection();

            // Step 4: Read the response
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            // Read each line from the response
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            // Step 5: Close the BufferedReader
            in.close();

            // Print the response
            System.out.println("Response: " + response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
