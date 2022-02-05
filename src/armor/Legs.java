package armor;

import java.util.HashMap;
import java.util.Map;

public class Legs extends Armor {
    public Legs(int defence, int dodgeChance) {
        super(defence, dodgeChance);
    }

    Legs legsStr = new Legs(17, 5);
    Legs legsAgility = new Legs(9, 10);
}
