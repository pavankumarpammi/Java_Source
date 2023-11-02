import java.io.*;
import java.net.*;

class HttpURLConnectionDemo{
public static void main(String[] args) {
try{
URL url = new URL("https://nptel.ac.in/course.php/");
InetAddress ip =InetAddress.getByName("www.google.com");
System.out.println("Host name :"+ip.getHostName());
System.out.println("Host address:"+ip.getHostAddress());
HttpURLConnection huc = (HttpURLConnection) url.openConnection();
for(int i=1;i<=8;i++){
System.out.println(huc.getHeaderFieldKey(i) +"="+huc.getHeaderField(i));
}
huc. disconnect () ;
}
catch (Exception e){

System. out.println(e);
}}}