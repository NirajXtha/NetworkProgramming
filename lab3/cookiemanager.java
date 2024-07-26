package lab3;

import java.net.*;
import java.util.List;
public class cookiemanager{
    public static void main(String[] args) throws Exception{
        String uri = "https://www.google.com/";
        CookieManager cookieManager =  new CookieManager();
        CookieHandler.setDefault(cookieManager);
        //setCookiePolicy can accept null parameters
        cookieManager.setCookiePolicy(null);
        URL url = new URL(uri);
        URLConnection connection = url.openConnection();
        connection.getContent();
        CookieStore cookieStore = cookieManager.getCookieStore();
        List<HttpCookie> cookieList=cookieStore.getCookies();
        for(HttpCookie cookie: cookieList){
            System.out.println("Name of the cookies:"+ cookie.getName());
        }   
    }
}

