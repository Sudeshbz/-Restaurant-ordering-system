package observer;

import java.util.ArrayList;
import java.util.List;

// Sipariþi temsil eden sýnýf
public class Order {
    private List<OrderObserver> observers = new ArrayList<>();
    private String status;

    // Gözlemci eklemek için metod
    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    // Sipariþ durumunu güncellemek için metod
    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    // Gözlemcilere durumu bildirmek için metod
    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(status);
        }
    }
}
