import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.net.URL;

public class DOTNETPackaage {
    public static void main(String[] args) throws MalformedURLException, UnknownHostException {
        URL u = new URL("http://www.google.com");
        System.out.println("Host" + u.getHost());
        System.out.println("Port" + u.getPort());
        System.out.println("Protocol" + u.getProtocol());

        InetAddress ad = InetAddress.getByName("www.google.com");
        System.out.println("IP ad" + ad.getHostAddress());
        System.out.println("Host" + ad.getHostName());
    }
}
