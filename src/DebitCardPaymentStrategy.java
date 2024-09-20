public class DebitCardPaymentStrategy implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("PProcessando pagamento do cartão de DÉBITO no valor de R$" + amount);
    }
}