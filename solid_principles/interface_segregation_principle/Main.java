// The interface segregation principle states that the 
// interface of a program should be split in a way that 
// the user/client would only have access to the necessary methods related to their needs.

package solid_principles.interface_segregation_principle;

class Document{}


// The interface IMachine has 3 methods: print, scan and fax
interface IMachine{
    void print(Document doc);
    void scan(Document doc);
    void fax(Document doc);

}

// Lets say we only want to create a printer. In that case we have to fill the other methods with some exceptions.
// This is not a good practice.
class Printer implements IMachine{
    @Override
    public void print(Document doc){
        System.out.println("printing doc...");
    }

    public void scan(Document doc){
        throw new IllegalStateException();
    }
    public void fax(Document doc){
        throw new IllegalStateException();
    }
}

// Instead we can segregate the interfaces
interface IPrinter{
    void print();
}

interface IScanner{
    void scan();
}

interface IFax{
    void fax();
}

// Now we can only use the interfaces we need

public class Main {
    public static void main(String[] args){

    }
}
