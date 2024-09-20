public class PaypalPaymentStrategy implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Processando pagamento por PAYPAL no valor de R$" + amount);
    }
}