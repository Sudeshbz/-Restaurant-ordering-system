package strategy;

// Kredi kartı ile ödeme stratejisi
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Kredi kartı ile ödendi: " + amount);
    }
}
