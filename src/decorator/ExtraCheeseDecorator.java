package decorator;

// Ekstra peynir süslemesi
public class ExtraCheeseDecorator implements OrderItem {
    private OrderItem item;

    public ExtraCheeseDecorator(OrderItem item) {
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + ", Extra Peynir";
    }

    @Override
    public double getCost() {
        return item.getCost() + 2.0;
    }
}
