package payment_adapter_exercise;

interface PaymentProcessor {
    void processPayment(double amount);
}

class GPayGateway {
    public void sendMoney(double amount) {
        System.out.println("Processing GPay payment of ₹" + amount);
    }
}

class PaytmGateway {
    public void transferAmount(double amount) {
        System.out.println("Processing Paytm payment of ₹" + amount);
    }
}

class GPayAdapter implements PaymentProcessor {
    private GPayGateway gpay;

    public GPayAdapter(GPayGateway gpay) {
        this.gpay = gpay;
    }

    public void processPayment(double amount) {
        gpay.sendMoney(amount);
    }
}

class PaytmAdapter implements PaymentProcessor {
    private PaytmGateway paytm;

    public PaytmAdapter(PaytmGateway paytm) {
        this.paytm = paytm;
    }

    public void processPayment(double amount) {
        paytm.transferAmount(amount);
    }
}
