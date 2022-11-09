package solid_principles.open_closed_principle;

import java.util.*;

// generic filter interface to filter out the items based on a specification
public interface FilterInterface<T> {
    List<T> filter(List<T> items, SpecificationInterface<T> s);    
}
