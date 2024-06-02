package decorator;

// Pizza s�n�f�, bir sipari� ��esi
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
