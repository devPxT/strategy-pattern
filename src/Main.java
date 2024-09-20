public class Main {
    public static void main(String[] args) throws Exception {
        pagarCartaoDeCredito(100.0);

        pagarCartaoDeDebito(200.0);

        pagarPaypal(300.0);
    }

    public static void pagarCartaoDeCredito(double amount) {
        PaymentProcessor credito = new PaymentProcessor(new CreditCardPaymentStrategy());
        credito.processPayment(amount);
    }

    public static void pagarCartaoDeDebito(double amount) {
        PaymentProcessor debito = new PaymentProcessor(new DebitCardPaymentStrategy());
        debito.processPayment(amount);
    }

    public static void pagarPaypal(double amount) {
        PaymentProcessor paypal = new PaymentProcessor(new PaypalPaymentStrategy());
        paypal.processPayment(amount);
    }
}
