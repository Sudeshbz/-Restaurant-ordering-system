package facade;

import command.Command;
import command.PlaceOrderCommand;
import decorator.OrderItem;
import factory.OrderItemFactory;
import singleton.Kitchen;
import strategy.PaymentStrategy;

// Sipariþ iþlemleri için facade sýnýfý
public class OrderFacade {
    private Kitchen kitchen;
    private PaymentStrategy paymentStrategy;

    public OrderFacade() {
        this.kitchen = Kitchen.getInstance();
    }

    // Sipariþ verme ve ödeme iþlemleri
    public void placeOrder(String itemType, PaymentStrategy paymentStrategy) {
        OrderItem item = OrderItemFactory.createOrderItem(itemType);
        Command placeOrder = new PlaceOrderCommand(kitchen, item);
        placeOrder.execute();
        this.paymentStrategy = paymentStrategy;
        paymentStrategy.pay(item.getCost());
    }
}
