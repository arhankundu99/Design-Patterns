package factories.with_factory;
import java.util.*;

public class Client {
    public static void main(String[] args){
        Transport t = null;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the transportation type: ");
        String userInput = scan.nextLine();

        t = TransportFactory.getTransport(userInput);
        // if(userInput.equals("S")){
        //     t = new Ship();
        // }
        // else t = new Truck();

        t.deliver();
        scan.close();
        
    }
}
