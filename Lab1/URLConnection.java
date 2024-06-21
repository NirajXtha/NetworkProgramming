import java.net.*;
import java.io.*;
//Only works on JDK version below 20
public class URLConnection {
    public static void main(String[] args) throws Exception{
        URL a = new URL("https://www.yahoo.com");
        URLConnection yc = a.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        String ln;

        while ((ln = in.readLine()) != null) 
            System.out.println(ln);
        in.close();
    }
}
