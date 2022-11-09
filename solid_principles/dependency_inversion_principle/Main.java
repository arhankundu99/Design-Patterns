package solid_principles.dependency_inversion_principle;

// The main idea of the dependency inversion principle is that 
// any class that uses a dependency should only ever use the dependency 
// through a predefined interface/wrapper. 
// This makes it so that your code will never directly depend on a low level API for its operations. 
// The reason this is so important is because if you ever need to change or remove that dependency 
// it becomes really difficult when it is used all over your code. By wrapping this dependency in an interface 
// you can depend on the interface you created which will make changing out the dependency painless.


// In this example we build an interface paymentProcessor to handle payments. 
//https://www.youtube.com/watch?v=9oHY5TllWaU

public class Main {
    public static void buyHelmet(int quantity, PaymentProcessor paymentProcessor){
        paymentProcessor.makePayment(quantity * 20);
    }
    public static void main(String[] args){
        
        buyHelmet(10, new StripeProcessor("Alex"));
        buyHelmet(20, new PaypalProcessor("Zayn"));
    }
}
