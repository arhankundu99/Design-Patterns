package factories.without_factory;
import java.util.*;

/* The problem without factory design pattern:
 * 1) Client has the information about the subclasses here (Truck and Ship). So if we add more classes, client will have to know about those too. 
 *    (But by using factory, we can hide the subclasses from the client.)
 * 2) Here, if any new class is added other than Truck and Ship, Client code would have to make another if statement. This can become very messy if
 *    there are many features (Using factory, we can keep the client code clean) 
 * 3) The objects creation is in one place in factory method which helps to maintain the code.

*/

public class Client {
    public static void main(String[] args){
        Transport t = null;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the transportation type: ");
        String userInput = scan.nextLine();


        if(userInput.equals("S")){
            t = new Ship();
        }
        else t = new Truck();

        t.deliver();
        scan.close();
        
    }
}
