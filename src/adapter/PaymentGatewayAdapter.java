package adapter;

import strategy.PaymentStrategy;

// Harici �deme sistemi i�in adapt�r
public class PaymentGatewayAdapter implements PaymentStrategy {
    private ExternalPaymentGateway externalPaymentGateway;

    public PaymentGatewayAdapter(ExternalPaymentGateway externalPaymentGateway) {
        this.externalPaymentGateway = externalPaymentGateway;
    }

    @Override
    public void pay(double amount) {
        externalPaymentGateway.processPayment(amount);
    }
}
