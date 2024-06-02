package adapter;

// Harici ödeme sistemi arayüzü
public interface ExternalPaymentGateway {
    void processPayment(double amount);
}
