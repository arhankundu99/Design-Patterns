package factories.without_factory;

public class Truck extends Transport {
    Truck(){

    }

    @Override
    void deliver(){
        System.out.println("The items are getting delivered by a truck.");
    }
}
