// Existing interface (target)
interface PaymentGateway {
    void processPayment(String account, double amount);
}

// New payment gateway (Adaptee)
class ModernPaymentGateway {
    public void pay(String email, double amount) {
        System.out.println("Payment made using modern gateway for " + email);
    }
}

// Adapter class
class PaymentAdapter implements PaymentGateway {
    private ModernPaymentGateway modernGateway;

    public PaymentAdapter(ModernPaymentGateway modernGateway) {
        this.modernGateway = modernGateway;
    }

    @Override
    public void processPayment(String account, double amount) {
        modernGateway.pay(account, amount); // Adapt old API to the new API
    }
}

// Client code
public class AdapterDemo {
    public static void main(String[] args) {
        ModernPaymentGateway modernGateway = new ModernPaymentGateway();
        PaymentGateway payment = new PaymentAdapter(modernGateway);

        payment.processPayment("user@example.com", 250.0);
    }
}
