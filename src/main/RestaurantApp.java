package main;

import adapter.ExternalPaymentGatewayImpl;
import adapter.PaymentGatewayAdapter;
import facade.OrderFacade;
import observer.Customer;
import observer.Order;
import strategy.CreditCardPayment;

public class RestaurantApp {
    public static void main(String[] args) {
        // M��teri olu�turma
        Customer customer1 = new Customer("Ahmet");
        Order order = new Order();
        order.addObserver(customer1);

        // Sipari� durumu g�ncelleme
        order.setStatus("Haz�rlan�yor");

        // Sipari� verme ve �deme i�lemi
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("PizzaExtraCheese", new CreditCardPayment());

        // Harici �deme sistemi ile �deme yapma
        orderFacade.placeOrder("Pizza", new PaymentGatewayAdapter(new ExternalPaymentGatewayImpl()));

        // Sipari� durumu g�ncelleme
        order.setStatus("Teslim Edildi");
    }
}
