// Abstract product
interface PaymentProcessor {
    void processPayment(double amount);
}

// Concrete product 1
class PayPalProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing payment through PayPal: $" + amount);
    }
}

// Concrete product 2
class StripeProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing payment through Stripe: $" + amount);
    }
}

class BankTransferProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing payment through Stripe: $" + amount);
    }
}

// Factory Method
class PaymentProcessorFactory {
    public static PaymentProcessor getPaymentProcessor(String type) {
        switch (type) {
            case "PayPal":
                return new PayPalProcessor();
            case "Stripe":
                return new StripeProcessor();
            case "BankTransfer":
                return new BankTransferProcessor();
            default:
                throw new IllegalArgumentException("Unknown payment type");
        }
    }
}
