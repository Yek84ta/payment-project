package payment;

public class CreditCardPayment implements PaymentStrategy{
    String cardNumber;
    String cardHolderName;

    public CreditCardPayment (String newCardNum, String newCardHolderName){
        if (newCardNum == null || newCardNum.trim().isEmpty()) {
             System.out.println("Card number cannot be null or empty.");
             return;
        }
        if (newCardHolderName == null || newCardHolderName.trim().isEmpty()) {
            System.out.println("Cardholder name cannot be null or empty.");
            return;
        }
        this.cardHolderName = newCardHolderName;
        this.cardNumber = newCardNum;
    }

    @Override
    public void pay (double amount){
        System.out.println("Paid amount: " + amount);
        System.out.println(this.getPaymentDetails());
    }

    @Override
    public String getPaymentDetails(){
        String paymentMethod = "Payment Method: Credit Card Payment";
        String number = "Credit card number: " + this.cardNumber;
        String name =  "Cardholder name: " + this.cardHolderName;

        return paymentMethod + "\n" + number + "\n" + name;
    }


}
