import java.net.*;

public class URLConnectionReader {
    public static void main(String[] args) throws Exception //Exception -> URISyntaxException
    {
        String str = "https://www.google.com/search?q=hello+world&sca_esv=eae7a402c78866a8&sca_upv=1&sxsrf=ADLYWIKaW7cvqdojDbtfH6BfVM6UkE3vcA%3A1718248243123&source=hp&ei=M2NqZo-hBaDVseMP1pivyAE&iflsig=AL9hbdgAAAAAZmpxQ6A5Tcdq41zBDAk1WHfDHLRMTROV&oq=hello+wor&gs_lp=Egdnd3Mtd2l6IgloZWxsbyB3b3IqAggAMgsQABiABBixAxiDATIOEC4YgAQYsQMYgwEY1AIyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDILEC4YgAQYxwEYrwEyBRAAGIAEMgUQABiABEi2GFDsAljND3ABeACQAQGYAdwFoAGOFaoBDTAuNC4yLjEuMS4wLjG4AQPIAQD4AQGYAgmgAtoPqAIKwgIHECMYJxjqAsICEBAuGAMY5QIY6gIYjAMYjwHCAhAQABgDGOUCGOoCGIwDGI8BwgIIEAAYgAQYsQPCAgQQLhgDwgILEC4YgAQYsQMYgwHCAhQQLhiABBixAxjRAxiDARjHARiKBcICCBAuGIAEGLEDwgILEC4YgAQYsQMY1ALCAgUQLhiABJgDCJIHCTEuNC4yLjEuMaAHq18&sclient=gws-wiz";
        // Creation of new URI by parsing the strting
        URI exampleuri = new URI(str);
        //different methods of URI (Uniform Resource Identifier)
        System.out.println("Host of the URI is: " + exampleuri.getHost());
        System.out.println("Port of the URI is: " + exampleuri.getPort());
        System.out.println("Raw path of the URI is: " + exampleuri.getRawPath());
        System.out.println("Path of the URI is: " + exampleuri.getPath());
        System.out.println("Query of the URI is: " + exampleuri.getQuery());
        System.out.println("Raw query of the URI is: " + exampleuri.getRawQuery());
        System.out.println("Fragment of the URI is: " + exampleuri.getFragment());
        System.out.println("Raw fragment of the URI is: " + exampleuri.getRawFragment());
        //another uri in order to demonstrate the method compareTo and equals
        URI examplUri2 = new URI(str + "fr");
        System.out.println("CompareTo example= " + exampleuri.compareTo(examplUri2));
        System.out.println("Equals of the URI is: " + exampleuri.equals(examplUri2));
        System.out.println("HashCode of the URI= " + exampleuri.hashCode());
        System.out.println("toString of the URI= " + exampleuri.toString());
        System.out.println("toASCIIString of the URI= " + exampleuri.toASCIIString());

    }
}
