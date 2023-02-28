import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        List<Item> items = ItemLoader.loadAllGameItems();
        inventory.equipRandomItems(items);
        inventory.displayEquippedInventory();
        inventory.displayOverallBonus();
    }
}