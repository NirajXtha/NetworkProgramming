import java.net.*;

public class ExampleFirst {
    public static void main(String []args){
        try{ //The following code creates an inetaddress object through a domain name
            // InetAddress ip=InetAddress.getByName("www.facebook.com");
            InetAddress ip=InetAddress.getLocalHost();
            String domainName = ip.getHostName();
            String IpName = ip.getHostAddress();

            System.out.println("Host Name: " + domainName);
            System.out.println("IP Address: "+ IpName);
        
        }
        catch(UnknownHostException e)
        {
            e.printStackTrace();
        }
    }
}
