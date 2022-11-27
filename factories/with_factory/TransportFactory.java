package factories.with_factory;

public class TransportFactory {
    public static Transport getTransport(String transportType){
        if(transportType.equals("S"))
            return new Ship();
        
        if(transportType.equals("T"))
            return new Truck();
        
        return null;
    }
}
