package observer_pattern_exercise7;

import java.util.*;

interface Stock {
    void register(Observer o);
    void deregister(Observer o);
    void notifyObservers();
}

class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private double price;

    public void register(Observer o) {
        observers.add(o);
    }

    public void deregister(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(price);
        }
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }
}

interface Observer {
    void update(double price);
}

class MobileApp implements Observer {
    public void update(double price) {
        System.out.println("Mobile App: Stock price updated to ₹" + price);
    }
}

class WebApp implements Observer {
    public void update(double price) {
        System.out.println("Web App: Stock price updated to ₹" + price);
    }
}
