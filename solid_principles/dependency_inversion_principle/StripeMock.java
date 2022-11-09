package solid_principles.dependency_inversion_principle;

public class StripeMock {
    String username;
    public StripeMock(String username){
        this.username = username;
    }

    public void makePayment(int amount){
        System.out.println(username + " has paid an amount of " + amount + " through stripe.");
    }
    
}
