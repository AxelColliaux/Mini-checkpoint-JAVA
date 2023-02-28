import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Inventory {
    public Item leftRing;
    public Item rightRing;
    public Item armor;
    public Item boots;


    public void equipRandomItems(List<Item> allGameAvailableItems) {

        // Those are java streams.
        // You don't need to understand them yet.
        // Simply understand that we transform one list of items (with mixed types) to three lists with same type.
        Map<ItemType, List<Item>> groupedItems = allGameAvailableItems.stream().collect(Collectors.groupingBy(Item::getType));
        List<Item> allRings = groupedItems.getOrDefault(ItemType.RING, new ArrayList<>());
        List<Item> allArmors = groupedItems.getOrDefault(ItemType.ARMOR, new ArrayList<>());
        List<Item> allBoots = groupedItems.getOrDefault(ItemType.BOOTS, new ArrayList<>());

        // Randomize their orders!
        Collections.shuffle(allRings);
        Collections.shuffle(allArmors);
        Collections.shuffle(allBoots);

        // And finally equip items
        if (allRings.size() >= 1) leftRing = allRings.get(0);
        if (allRings.size() >= 2) rightRing = allRings.get(1);
        if (allArmors.size() >= 1) armor = allArmors.get(0);
        if (allBoots.size() >= 1) boots = allBoots.get(0);
    }

    public void displayEquippedInventory() {
        System.out.println("");
        System.out.println("*** equipped items ***");
        displayEquippedItem("left ring", leftRing);
        displayEquippedItem("right ring", rightRing);
        displayEquippedItem("left ring", armor);
        displayEquippedItem("boots", boots);
    }
    private void displayEquippedItem(String label, Item item) {
        if (item != null) {
            System.out.println(label + ": " + item.getDescription() + " (" + item.getBonusDescription() + ")");
        } else {
            System.out.println(label + ": NONE");
        }
    }

    public void displayOverallBonus() {
        System.out.println("");
        System.out.println("*** overall bonus ***");
        // TODO - replace me with better code...
        System.out.println("TODO!");
    }

}
