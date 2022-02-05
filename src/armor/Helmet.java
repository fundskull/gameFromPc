package armor;

import java.util.HashMap;
import java.util.Map;

public class Helmet extends Armor {
    public Helmet(int defence, int dodgeChance) {
        super(defence, dodgeChance);
    }
    Map<String, Helmet> helmets = new HashMap<>();
    
}
