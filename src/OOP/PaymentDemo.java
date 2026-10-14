package OOP;

abstract class PaymentAccount {
    protected double amount;

    PaymentAccount(double amount) {
        this.amount = amount;
    }

    abstract void processPayment();
}

interface Refundable {
    void refundPayment();
}

class CashPayment extends PaymentAccount
        implements Refundable {

    CashPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        System.out.println("Payment received: PHP " + amount);
    }

    @Override
    public void refundPayment() {
        System.out.println("Refund processed: PHP " + amount);
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        CashPayment payment = new CashPayment(500);

        payment.processPayment();
        payment.refundPayment();
    }
}