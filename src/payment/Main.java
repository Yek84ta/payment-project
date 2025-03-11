package payment;

public class Main {
    public static void main(String[] args) {
        Customer.RegularCustomer regularCustomer = new Customer.RegularCustomer("Chandler Bing");
        Customer.PremiumCustomer premiumCustomer1 = new Customer.PremiumCustomer("Rachel Green");
        Customer.PremiumCustomer premiumCustomer2 = new Customer.PremiumCustomer("Joey Tribbiani");

        System.out.println("Customers Information:");
        regularCustomer.displayCustomerInfo();
        System.out.println();
        premiumCustomer1.displayCustomerInfo();
        System.out.println();
        premiumCustomer2.displayCustomerInfo();
        System.out.println();


        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "Chandler Bing");
        PaymentStrategy payPalPayment = new PayPalPayment("green.rachel@gmail.com");
        PaymentStrategy bitcoinPayment = new BitcoinPayment("J98t1WpEZ73CNmQviecrnyiWrnqRhWNLy");


        regularCustomer.makePayment(creditCardPayment, 560);
        System.out.println();
        regularCustomer.makePayment(creditCardPayment, 480);
        System.out.println();
        premiumCustomer1.makePayment(payPalPayment, 1200);
        System.out.println();
        premiumCustomer1.makePayment(payPalPayment, 690);
        System.out.println();
        premiumCustomer2.makePayment(bitcoinPayment, 800);
        System.out.println();
        premiumCustomer2.makePayment(bitcoinPayment, 720);
        System.out.println();


        System.out.println("Customers Payment History:");
        System.out.println();
        System.out.println("Customer:" + regularCustomer.name);
        regularCustomer.showPaymentHistory();
        System.out.println();
        System.out.println("Customer:" + premiumCustomer1.name);
        premiumCustomer1.showPaymentHistory();
        System.out.println();
        System.out.println("Customer:" + premiumCustomer2.name);
        premiumCustomer2.showPaymentHistory();
    }
}