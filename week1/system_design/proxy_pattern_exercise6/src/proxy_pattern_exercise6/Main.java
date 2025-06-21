package proxy_pattern_exercise6;
public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        image1.display(); // Loads and displays
        image1.display(); // Only displays (cached)

        image2.display(); // Loads and displays
    }
}
