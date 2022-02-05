package armor;

public class Boots extends Armor {
    public Boots(int defence, int dodgeChance) {
        super(defence, dodgeChance);
    }

    Boots bootsStr = new Boots(15, 3);
    Boots bootsAgility = new Boots(7, 8);
}
