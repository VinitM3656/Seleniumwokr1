package JavaPrograms.IFElse;

import java.net.URL;

public class GetUrlUsingJava {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.facebook.com/java");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("File NAME: " + url.getFile());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
