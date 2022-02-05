package personages;

import armor.Armor;
import weapon.Weapon;

import java.util.ArrayList;

public class Character {
    private String name;
    private int health;
    private boolean dodge = false;
    private boolean parry = false;
    ArrayList<Weapon> hands;
    ArrayList<Armor> body;

    public Character() {

    }
    public Character(String name, int health, boolean dodge, boolean parry) {
        this.name = name;
        this.health = health;
        this.dodge = dodge;
        this.parry = parry;
    }

    public Character(String name, int health, boolean dodge, boolean parry, ArrayList<Weapon> hands, ArrayList<Armor> body) {
        this.name = name;
        this.health = health;
        this.dodge = dodge;
        this.parry = parry;
        this.hands = hands;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isDodge() {
        return dodge;
    }

    public void setDodge(boolean dodge) {
        this.dodge = dodge;
    }

    public boolean isParry() {
        return parry;
    }

    public void setParry(boolean parry) {
        this.parry = parry;
    }

    public ArrayList<Weapon> getHands() {
        return hands;
    }

    public void setHands(ArrayList<Weapon> hands) {
        this.hands = hands;
    }

    public ArrayList<Armor> getBody() {
        return body;
    }

    public void setBody(ArrayList<Armor> body) {
        this.body = body;
    }

}
