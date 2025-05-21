import java.util.ArrayList;
import java.util.Collection;

// This code demonstrates a simple example of a composite pattern where
// an Item can be a simple item or a box that can contain other items.
public class CreationalMagic {
    public static void main(String[] args) {
        Item pen = new Item();
        Box penBox = new Box();

        penBox.addItem(pen);

        Box pinBox = new Box();

        Item pin = new Item();
        pinBox.addItem(pin);

        penBox.addItem(pinBox); 
        
    }
}

class Item {

}

class Box extends Item {   

    private final Collection<Item> items;

    public Box() {
        this.items = new ArrayList<>();
    }

    void addItem(Item item) {
        items.add(item);
    }
}