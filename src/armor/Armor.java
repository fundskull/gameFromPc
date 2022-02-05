package armor;

import personages.Hero;

public class Armor {
    int defence;
    int dodgeChance;

    public Armor(int defence, int dodgeChance) {
        this.defence = defence;
        this.dodgeChance = dodgeChance;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getDodgeChance() {
        return dodgeChance;
    }

    public void setDodgeChance(int dodgeChance) {
        this.dodgeChance = dodgeChance;
    }

    public static int dodgeChanceWork(Hero hero) {
        int dodgeSum = 0;
        for (int i = 0; i < hero.getBody().size(); i++) {
            dodgeSum += hero.getBody().get(i).getDodgeChance();
        }
        return dodgeSum;
    }

    public static int defenceSum(Hero hero) {
        int defence = 0;
        for (int i = 0; i < hero.getBody().size(); i++) {
            defence += hero.getBody().get(i).getDefence();
        }
        return defence;
    }
}