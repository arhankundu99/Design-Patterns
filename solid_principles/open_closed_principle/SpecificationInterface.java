package solid_principles.open_closed_principle;

// specification interface.
public interface SpecificationInterface<T> {
    
    boolean isSpecificationSatisfied(T item);
}
