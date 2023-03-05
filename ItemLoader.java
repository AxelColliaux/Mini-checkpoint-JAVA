import java.util.ArrayList;
import java.util.List;

public class ItemLoader {
    public static List<Item> items = new ArrayList<>();

    static {
        initItems();
    }

    public static void initItems() {

        items.add(new Boots("Light Elfic Boots", 0, 2, 0, 1));

        // TODO - create here new instances of your items
        items.add(new Ring("Intelligence Elfic Ring", 5, 1, 1, 1));
        items.add(new Ring("Agility Elfic Ring", 1, 3, 0, 0));
        // items.add(new Armor("Light Elfic Armor", 0, 0, 0, 10));

    }

    public static List<Item> loadAllGameItems() {
        return items;
    }
}
