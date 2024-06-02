package decorator;

// Pizza sýnýfý, bir sipariþ öðesi
public class Pizza implements OrderItem {
    @Override
    public String getDescription() {
        return "Pizza";
    }

    @Override
    public double getCost() {
        return 20.0;
    }
}
