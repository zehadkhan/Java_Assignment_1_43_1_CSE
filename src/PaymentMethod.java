interface PaymentMethod {
    void processPayment(double amount);

    void refund(double amount);
}
class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding $" + amount + " to credit card");
    }
}

class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding $" + amount + " to PayPal");
    }
}

class CryptocurrencyPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment of $" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding $" + amount + " in cryptocurrency");
    }
}

