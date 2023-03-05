public class Armor extends AbstractItem implements Item {

    public Armor(String description, int intelligence, int agility, int strength, int resistance) {
        super(description, intelligence, agility, strength, resistance);
    }

    @Override
    public ItemType getType() {
        return ItemType.ARMOR;
    }
}
