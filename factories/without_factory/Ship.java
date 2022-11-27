package factories.without_factory;

public class Ship extends Transport {
    Ship(){

    }

    @Override
    void deliver(){
        System.out.println("The items are getting delivered by a ship.");
    }
}
