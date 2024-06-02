package singleton;

import decorator.OrderItem;

// Mutfak sýnýfý, Singleton deseni ile
public class Kitchen {
    private static Kitchen instance;

    private Kitchen() {
    }

    // Singleton örneði almak için metod
    public static Kitchen getInstance() {
        if (instance == null) {
            instance = new Kitchen();
        }
        return instance;
    }

    // Sipariþ hazýrlama metodu
    public void prepareOrder(OrderItem item) {
        System.out.println(item.getDescription() + " hazýrlanýyor. Maliyet: " + item.getCost());
    }
}
