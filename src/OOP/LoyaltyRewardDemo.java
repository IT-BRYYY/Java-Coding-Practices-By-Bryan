
package OOP;

abstract class ShoppingActivity {
    protected String customerName;

    ShoppingActivity(String customerName) {
        this.customerName = customerName;
    }

    public abstract void completePurchase();
}

interface PurchaseTrackable {
    double getPurchaseAmount();
}

interface VoucherEligible extends PurchaseTrackable {
    void issueVoucher();
}

class LoyalCustomer extends ShoppingActivity
        implements VoucherEligible {

    private double purchaseAmount;

    LoyalCustomer(String customerName,
                  double purchaseAmount) {
        super(customerName);
        this.purchaseAmount = purchaseAmount;
    }

    @Override
    public void completePurchase() {
        System.out.println(
                "Purchase completed by: " + customerName
        );
    }

    @Override
    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    @Override
    public void issueVoucher() {
        if (purchaseAmount >= 5000) {
            System.out.println(
                    "Reward voucher issued: PHP 500"
            );
        } else {
            System.out.println(
                    "Purchase more to qualify for a voucher."
            );
        }
    }
}

public class LoyaltyRewardDemo {
    public static void main(String[] args) {
        LoyalCustomer customer =
                new LoyalCustomer("Jordan", 6500);

        ShoppingActivity activity = customer;
        activity.completePurchase();

        VoucherEligible eligible = customer;

        System.out.println(
                "Purchase amount: PHP "
                        + eligible.getPurchaseAmount()
        );

        eligible.issueVoucher();
    }
}
