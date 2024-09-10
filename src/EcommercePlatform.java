// Strategy interface
interface DiscountStrategy {
    double applyDiscount(double price);
}

// Concrete strategies
class PercentageDiscount implements DiscountStrategy {
    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double price) {
        return price - (price * percentage / 100);
    }
}

class FixedDiscount implements DiscountStrategy {
    private double discount;

    public FixedDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double applyDiscount(double price) {
        return price - discount;
    }
}

// Context
class Cart {
    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double checkout(double totalAmount) {
        return discountStrategy.applyDiscount(totalAmount);
    }
}

// Client code
public class EcommercePlatform {
    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.setDiscountStrategy(new PercentageDiscount(10)); // 10% discount
        System.out.println("Total after discount: $" + cart.checkout(100));

        cart.setDiscountStrategy(new FixedDiscount(15)); // $15 off
        System.out.println("Total after discount: $" + cart.checkout(100));
    }
}
