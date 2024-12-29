public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.setPaymentMethod(new CreditCardPayment());
        processor.processPayment(100.0);

        processor.setPaymentMethod(new BankTransferPayment());
        processor.processPayment(200.0);
    }
}