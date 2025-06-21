package payment_adapter_exercise;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor gpayProcessor = new GPayAdapter(new GPayGateway());
        PaymentProcessor paytmProcessor = new PaytmAdapter(new PaytmGateway());

        gpayProcessor.processPayment(1500);
        paytmProcessor.processPayment(3000);
    }
}
