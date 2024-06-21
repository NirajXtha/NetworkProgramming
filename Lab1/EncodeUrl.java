//JDK version below 20 required, else not supported
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class EncodeUrl {
    public static void main(String[] args) throws MalformedURLException, UnsupportedEncodingException {
        //base url
        String baseurl = "https://www.geeksforgeeks.org";

        //String to be encoded
        String query = "u@geeks for geeks";

        System.out.println("URL without encoding");
        URL url = new URL(baseurl + query);
        System.out.println(url);

        //encode() method
        System.out.println("URL after encoding");
        url = new URL(baseurl + URLEncoder.encode(query, "UTF-8"));
        System.out.println(url);
    }
}
