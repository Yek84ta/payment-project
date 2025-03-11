package payment;

public class BitcoinPayment implements PaymentStrategy{
    String walletAddress;

    public BitcoinPayment (String newWalletAddress){
        if (newWalletAddress == null || newWalletAddress.trim().isEmpty()) {
            System.out.println("Wallet address cannot be null or empty.");
            return;
        }

        this.walletAddress = newWalletAddress;
    }

    @Override
    public void pay (double amount){

        System.out.println("Paid amount: " + amount);
        System.out.println(this.getPaymentDetails());

    }

    @Override
    public String getPaymentDetails(){
        String paymentMethod = "Payment Method: Bitcoin Payment";
        String address = "Wallet address used for payment:  " + this.walletAddress;

        return paymentMethod + "\n" + address ;
    }
}
