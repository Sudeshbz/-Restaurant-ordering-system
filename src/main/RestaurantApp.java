package main;

import adapter.ExternalPaymentGatewayImpl;
import adapter.PaymentGatewayAdapter;
import facade.OrderFacade;
import observer.Customer;
import observer.Order;
import strategy.CreditCardPayment;

public class RestaurantApp {
    public static void main(String[] args) {
        // Müþteri oluþturma
        Customer customer1 = new Customer("Ahmet");
        Order order = new Order();
        order.addObserver(customer1);

        // Sipariþ durumu güncelleme
        order.setStatus("Hazýrlanýyor");

        // Sipariþ verme ve ödeme iþlemi
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("PizzaExtraCheese", new CreditCardPayment());

        // Harici ödeme sistemi ile ödeme yapma
        orderFacade.placeOrder("Pizza", new PaymentGatewayAdapter(new ExternalPaymentGatewayImpl()));

        // Sipariþ durumu güncelleme
        order.setStatus("Teslim Edildi");
    }
}
