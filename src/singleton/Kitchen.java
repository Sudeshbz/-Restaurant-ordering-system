package singleton;

import decorator.OrderItem;

// Mutfak s�n�f�, Singleton deseni ile
public class Kitchen {
    private static Kitchen instance;

    private Kitchen() {
    }

    // Singleton �rne�i almak i�in metod
    public static Kitchen getInstance() {
        if (instance == null) {
            instance = new Kitchen();
        }
        return instance;
    }

    // Sipari� haz�rlama metodu
    public void prepareOrder(OrderItem item) {
        System.out.println(item.getDescription() + " haz�rlan�yor. Maliyet: " + item.getCost());
    }
}
