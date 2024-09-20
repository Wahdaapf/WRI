public class Main {
    public static void main(String[] args) {
        // pay using credit card, paypal, or bank transfer
        // Payment payment = new Paypal();
        // Payment payment = new CreditCard();
        Payment payment = new BankTransfer();
        // ^ ini interface
        payment.pay();
        // expected output:
        // paid using paypal
        // paid using credit card
        // paid using bank transfer
    }
}