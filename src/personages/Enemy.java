package personages;

import armor.Armor;
import weapon.Weapon;

import java.util.ArrayList;

public class Enemy extends Character {
    private int attack;
    public Enemy() {
    }

    public Enemy(String name, int health, boolean dodge, boolean block, int attack) {
        super(name, health, dodge, block);
        this.attack = attack;
    }

    public Enemy(String name, int health, boolean dodge, boolean block, ArrayList<Weapon> hands, ArrayList<Armor> body) {
        super(name, health, dodge, block, hands, body);
    }

    public static Enemy getEnemy() {
        Enemy enemy = new Enemy("Ogr", 600, false, false, 60);
        return enemy;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
