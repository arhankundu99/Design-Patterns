package factories.with_factory;

public class Truck extends Transport {
    Truck(){

    }

    @Override
    void deliver(){
        System.out.println("The items are getting delivered by a truck.");
    }
}
