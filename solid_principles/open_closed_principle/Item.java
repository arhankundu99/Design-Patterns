package solid_principles.open_closed_principle;

public class Item {
    private Color color;
    private Size size;

    public Item(Color color, Size size){
        this.color = color;
        this.size = size;
    }

    public Color getColor(){
        return this.color;
    }

    public Size getSize(){
        return this.size;
    }

    @Override
    public String toString(){
        return "Item Color: " + this.color + " Item Size: " + this.size; 
    }
}
