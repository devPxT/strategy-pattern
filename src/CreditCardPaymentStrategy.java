public class CreditCardPaymentStrategy implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Processando pagamento do cartão de CRÉDITO no valor de R$" + amount);
    }
}