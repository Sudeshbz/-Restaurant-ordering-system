package observer;

// M��teriyi temsil eden s�n�f
public class Customer implements OrderObserver {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println(name + " m��terisine bildirim: Sipari� durumu " + status);
    }
}
