import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
public class Connection {
    public static void main(String[] args) {
        try{
            URL obj= new URL("https://www.google.com");
            URLConnection conn = obj.openConnection();
            Map<String, List<String>> map = conn.getHeaderFields();
            System.out.println("Printing Response Header..\n");
            for(Map.Entry<String, List<String>> entry:map.entrySet()){
                System.out.println("key:"+entry.getKey()+
                ", Value:"+entry.getValue()
                );
            }
            System.out.println("\n Get Response Header by key....\n");
            String server= conn.getHeaderField("Server");
            if(server==null){
                System.out.println("Key 'server' is not found!" );
            }else{
                System.out.println("Server-"+server);
            }
            System.out.println("\n Done");
        }catch(Exception e){
            e.printStackTrace(); }  } }
