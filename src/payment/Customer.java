package payment;

import java.util.ArrayList;

public abstract class Customer {
    String name;
    ArrayList<String> paymentHistory;

    public Customer(String newName) {
        this.name = newName;
        this.paymentHistory = new ArrayList<>();
    }

    public abstract void displayCustomerInfo();

    public void makePayment(PaymentStrategy newStrategy, double amount) {
        newStrategy.pay(amount);
        String newPaymentDetail = newStrategy.getPaymentDetails() +"\n" + "Paid amount:" + amount;
        paymentHistory.add(newPaymentDetail);
    }

    public void showPaymentHistory() {
        if (paymentHistory.isEmpty()){
            System.out.println("No payment has been made yet!");
            return;
        }

        for (String payment : paymentHistory) {
            System.out.println(payment);
        }
    }

    public static class RegularCustomer extends Customer {
        public RegularCustomer(String name) {
            super(name);
        }

        @Override
        public void displayCustomerInfo() {
            System.out.println("Customer's name: " + name);
            System.out.println("Customer's type: Regular customer");
        }
    }

    public static class PremiumCustomer extends Customer {
        public PremiumCustomer(String name) {
            super(name);
        }

        @Override
        public void displayCustomerInfo() {
            System.out.println("Customer's name: " + name);
            System.out.println("Customer's type: Premium customer");
        }
    }
}