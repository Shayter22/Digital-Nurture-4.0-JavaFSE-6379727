package statergy_pattern_exersice8;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.payAmount(1500);

        context.setStrategy(new PayPalPayment());
        context.payAmount(3000);
    }
}
