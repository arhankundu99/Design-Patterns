package solid_principles.liscov_substitution_principle;

// The Liskov Substitution Principle states that subclasses should be substitutable for their base classes.

// This means that, given that class B is a subclass of class A, 
// we should be able to pass an object of class B to any method that expects an object of class A 
// and the method should not give any weird output in that case.


//Below is an example that violates this principle.

class Rectangle{
    private int w, h;
    Rectangle(int w, int h){
        this.w = w;
        this.h = h;
    }

    void setH(int h){
        this.h = h;
    }

    void setW(int w){
        this.w = w;
    }

    int getW(){
        return w;
    }

    int getArea(){
        return w * h;
    }
}

class Square extends Rectangle{
    
    Square(int s){
        super(s, s);
    }

    @Override
    void setH(int s){
        super.setW(s);
        super.setH(s);
    }

    @Override
    void setW(int s){
        super.setW(s);
        super.setH(s);
    }
}



public class Main {
    public static void main(String[] args){
        Rectangle r = new Rectangle(3, 5);
        testArea(r);

        Rectangle s = new Square(4);
        testArea(s);
    }

    public static void testArea(Rectangle r){
        int w = r.getW();
        r.setH(20);
        System.out.println("Expected Area: " + (w * 20) + ", Actual Area: " + r.getArea());
    
    }
}
