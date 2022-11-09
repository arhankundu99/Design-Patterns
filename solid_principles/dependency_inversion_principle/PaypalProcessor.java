package solid_principles.dependency_inversion_principle;

public class PaypalProcessor implements PaymentProcessor{
    PaypalMock paypal;
    String username;
    public PaypalProcessor(String username){
        //initialise the paypal API
        paypal = new PaypalMock();

        this.username = username;
    }
    
    @Override
    public void makePayment(int amount){
        paypal.makePayment(username, amount);
    }
}
