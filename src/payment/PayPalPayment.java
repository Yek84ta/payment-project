package payment;

public class PayPalPayment implements PaymentStrategy{
    String email;

    public PayPalPayment (String newEmail){
        if (newEmail == null || newEmail.trim().isEmpty()) {
            System.out.println("Email cannot be null or empty.");
            return;
        }

        this.email = newEmail;
    }

    @Override
    public void pay (double amount){

        System.out.println("Paid amount: " + amount);
        System.out.println(this.getPaymentDetails());

    }

    @Override
    public String getPaymentDetails(){
        String paymentMethod = "Payment Method: Pay pal Payment";
        String mail = "Email used for payment: " + this.email;


        return paymentMethod + "\n" + mail ;
    }
}
