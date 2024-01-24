package BuilderExample;

public class Demo {
    public static void main(String[] args) {
        URL url=new URL();
        url.setProtocol("https://");
        url.setHostName("Subha");
        url.setPort(":8080/");
        //url.setpathParam("homepage");
        System.out.print(url.getProtocol());
        System.out.print(url.getHostName());
        System.out.print(url.getPort());
       // System.out.print(url.getpathParam());

    }
}
