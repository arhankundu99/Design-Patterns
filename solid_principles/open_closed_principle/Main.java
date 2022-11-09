// Open-Closed principle states that our code should be closed for modification and open for adding new features.
// We should be able to add new functionality without touching the existing code for the class. 
// This is because whenever we modify the existing code, we are taking the risk of creating potential bugs. 
// So we should avoid touching the tested and reliable (mostly) production code if possible.

// The way to achieve this is to write generic interfaces so that when we want to add a new feature, 
// we can just create a feature class using the defined interface


// Eg: We want to build a filtering system on a list of items. 
// Now whenever we want to filter based on a new specification, 
// we can just create a class for the specification instead of touching the existing and tested code 

package solid_principles.open_closed_principle;

import java.util.*;

public class Main {
    static void main(String[] args){
        List<Item> list = new ArrayList<>();
        list.add(new Item(Color.RED, Size.XL));
        list.add(new Item(Color.GREEN, Size.XL));
        list.add(new Item(Color.GREEN, Size.XS));
        
        SpecificationInterface<Item> colorSpecification = new ColorSpecification(Color.GREEN);

        Filter<Item> filter = new Filter<>();

        List<Item> filteredItems = filter.filter(list, colorSpecification);
    
        for(Item item: filteredItems){
            System.out.println(item);
        }

    }
}
