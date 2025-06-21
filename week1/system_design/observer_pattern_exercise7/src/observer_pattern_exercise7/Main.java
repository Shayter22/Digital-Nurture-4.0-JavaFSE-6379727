package observer_pattern_exercise7;

public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        market.register(mobile);
        market.register(web);

        market.setPrice(1200.50);
        market.setPrice(1250.75);
    }
}
