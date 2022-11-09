package solid_principles.dependency_inversion_principle;

public class PaypalMock {
    public PaypalMock(){

    }
    public void makePayment(String username, int amount){
        System.out.println(username + " has paid an amount of " + amount + " through paypal.");
    }
}
