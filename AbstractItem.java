public abstract class AbstractItem {
    
    private int intelligence;
    private int agility;
    private int strength;
    private int resistance;
    private String description;

    public AbstractItem(String description, int intelligence, int agility, int strength, int resistance) {
        this.intelligence = intelligence;
        this.agility = agility;
        this.strength = strength;
        this.resistance = resistance;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
    public String getBonusDescription() {
        return "INT=" + intelligence + " AGI=" + agility + " STR=" + strength + " RES=" + resistance;
    }
    
    public int getIntelligenceBonus() {
        return intelligence;
    }
    
    public int getAgilityBonus() {
        return agility;
    }
    
    public int getStrengthBonus() {
        return strength;
    }

    public int getResistanceBonus() {
        return resistance;
    }
}
