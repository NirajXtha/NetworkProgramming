
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class Http {
    public static void main(String[] args) {
        try {   
            URL obj = new URL("http://www.google.com");
            URLConnection con = obj.openConnection();
            Map<String, List<String>> map = con.getHeaderFields();

            System.out.println("Printing All Responses Header for URL:" + obj.toString()+"\n");
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

            System.out.println("\nGet Responses Header By Key....\n");
            List<String> contentLength = map.get("content-Length");
            if (contentLength == null) {
                System.out.println("'Content-Length' doesn't present in headers");
            } else {
                for (String Header : contentLength) {
                    System.out.println("Content-Length: " + Header);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}