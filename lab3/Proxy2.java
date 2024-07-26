package lab3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
public class Proxy2 {
    public static void main(String[] args) {
        try{
            System.setProperty("java.net.useSystemProxies", "true");
            List<Proxy> l=ProxySelector.getDefault().select(new URI("http://www.google.com/"));
            for(Iterator<Proxy> iter = l.iterator();
            iter.hasNext();){
                Proxy proxy = iter.next();
                System.out.println("proxy hostname:"+proxy.type());
                InetSocketAddress addr = (InetSocketAddress)proxy.address();
                if (addr==null){
                    System.out.println("No Proxy");
                }else{
                    System.out.println("proxy hostname:"+addr.getHostName());
                    System.out.println("proxy port:"+addr.getPort());
                }
            }
        } catch(Exception e){
            e.printStackTrace();        } } }

            