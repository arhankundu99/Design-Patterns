package solid_principles.open_closed_principle;


public class ColorSpecification implements SpecificationInterface<Item>{
    Color color;
    public ColorSpecification(Color color){
        this.color = color;
    }
    
    @Override
    public boolean isSpecificationSatisfied(Item item) {
        return item.getColor() == color;
    }
}
