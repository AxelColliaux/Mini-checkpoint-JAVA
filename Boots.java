public class Boots implements Item {
    private int intelligence;
    private int agility;
    private int strength;
    private int resistance;
    private String description;

    public Boots(String description, int intelligence, int agility, int strength, int resistance) {
        this.intelligence = intelligence;
        this.agility = agility;
        this.strength = strength;
        this.resistance = resistance;
        this.description = description;
    }

    @Override
    public ItemType getType() {
        return ItemType.BOOTS;
    }
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public String getBonusDescription() {
        return "INT=" + intelligence + " AGI=" + agility + " STR=" + strength + " RES=" + resistance;
    }
    @Override
    public int getIntelligenceBonus() {
        return intelligence;
    }
    @Override
    public int getAgilityBonus() {
        return agility;
    }
    @Override
    public int getStrengthBonus() {
        return strength;
    }
    @Override
    public int getResistanceBonus() {
        return resistance;
    }
}
