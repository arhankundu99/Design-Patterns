package solid_principles.open_closed_principle;
import java.util.*;

public class Filter<T> implements FilterInterface<T>{
    
    public Filter(){
        
    }

    @Override
    public List<T> filter(List<T> items, SpecificationInterface<T> s){
        List<T> filteredItems = new ArrayList<>();

        for(T item: items){
            if(s.isSpecificationSatisfied(item)){
                filteredItems.add(item);
            }
        }
        return filteredItems;
    }   
}
