package strategy;

// Paypal ile �deme stratejisi
public class PaypalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paypal ile �dendi: " + amount);
    }
}
