package strategy;

// Kredi kart� ile �deme stratejisi
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Kredi kart� ile �dendi: " + amount);
    }
}
