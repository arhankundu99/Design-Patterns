package solid_principles.dependency_inversion_principle;

public class StripeProcessor implements PaymentProcessor {
    StripeMock stripe;
    public StripeProcessor(String username){
        stripe = new StripeMock(username);
    }

    @Override
    public void makePayment(int amount){
        stripe.makePayment(amount);
    }
}
