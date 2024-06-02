package adapter;

// Harici ödeme sistemi sýnýfý
public class ExternalPaymentGatewayImpl implements ExternalPaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Harici ödeme sistemi ile ödendi: " + amount);
    }
}
