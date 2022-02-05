package armor;

public class Breastplate extends Armor {
    public Breastplate(int defence, int dodgeChance) {
        super(defence, dodgeChance);
    }

    Breastplate breastplatesStr = new Breastplate(25, 4);
    Breastplate breastplateAgility = new Breastplate(11, 13);
}
