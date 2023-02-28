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

    }

    public static List<Item> loadAllGameItems() {
        return items;
    }
}
