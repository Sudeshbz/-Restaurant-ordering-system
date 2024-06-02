package observer;

// Müþteriyi temsil eden sýnýf
public class Customer implements OrderObserver {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println(name + " müþterisine bildirim: Sipariþ durumu " + status);
    }
}
