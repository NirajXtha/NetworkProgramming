import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class HTTP{
    public static void main(String[] args) {
        try{
            URL obj = new URL("https://www.google.com");
            URLConnection con = obj.openConnection();
            Map<String, List<String>> map = con.getHeaderFields();

            System.out.println("Printing All Response Header for URL: " + obj.toString() + "\n");
            for(Map.Entry<String, List<String>> entry : map.entrySet()){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

            System.out.println("\nGet response Header by key .....\n");
            List<String> contentLength = map.get("Content-Length");
            if(contentLength == null){
                System.out.println("'Content-Length' doesn't present in Header!");
            }else{
                for(String header : contentLength){
                    System.out.println("Content-Length: " + header);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}