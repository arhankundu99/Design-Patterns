package solid_principles.open_closed_principle;

public class SizeSpecification implements SpecificationInterface<Item>{
    Size size;
    public SizeSpecification(Size size){
        this.size = size;
    }
    
    @Override
    public boolean isSpecificationSatisfied(Item item) {
        return item.getSize() == size;
    }
}
