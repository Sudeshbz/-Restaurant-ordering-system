package strategy;

// Paypal ile ödeme stratejisi
public class PaypalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paypal ile ödendi: " + amount);
    }
}
