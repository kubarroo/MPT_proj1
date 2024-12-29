public class PaymentProcessor {
    private PaymentMethod paymentMethod;

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        if (paymentMethod == null) {
            throw new IllegalStateException("Payment method not set");
        }
        paymentMethod.pay(amount);
    }
}
