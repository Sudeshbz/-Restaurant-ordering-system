package observer;

import java.util.ArrayList;
import java.util.List;

// Sipari�i temsil eden s�n�f
public class Order {
    private List<OrderObserver> observers = new ArrayList<>();
    private String status;

    // G�zlemci eklemek i�in metod
    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    // Sipari� durumunu g�ncellemek i�in metod
    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    // G�zlemcilere durumu bildirmek i�in metod
    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(status);
        }
    }
}
