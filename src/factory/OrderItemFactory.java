package factory;

import decorator.ExtraCheeseDecorator;
import decorator.OrderItem;
import decorator.Pizza;

// Sipari� ��esi fabrikas�
public class OrderItemFactory {
    public static OrderItem createOrderItem(String type) {
        switch (type) {
            case "Pizza":
                return new Pizza();
            case "PizzaExtraCheese":
                return new ExtraCheeseDecorator(new Pizza());
            default:
                throw new IllegalArgumentException("Ge�ersiz sipari� t�r�");
        }
    }
}
