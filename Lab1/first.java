
import java.net.*;
public class first{
    public static void main(String []args){
        try{
            InetAddress ip=InetAddress.getByName("www.javapoint.com");
            System.out.println("Host NAme:" +ip.getHostName());
            System.out.println("IP Address:"+ip.getHostAddress());
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}