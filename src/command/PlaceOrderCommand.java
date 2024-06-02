package command;

import decorator.OrderItem;
import singleton.Kitchen;

// Sipariþ verme komutu
public class PlaceOrderCommand implements Command {
    private Kitchen kitchen;
    private OrderItem item;

    public PlaceOrderCommand(Kitchen kitchen, OrderItem item) {
        this.kitchen = kitchen;
        this.item = item;
    }

    @Override
    public void execute() {
        kitchen.prepareOrder(item);
    }
}
