import java.util.ArrayList;
import java.util.Collection;

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