package adapter;

// Harici �deme sistemi s�n�f�
public class ExternalPaymentGatewayImpl implements ExternalPaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Harici �deme sistemi ile �dendi: " + amount);
    }
}
