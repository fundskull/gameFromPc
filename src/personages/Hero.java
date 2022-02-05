package personages;

import armor.*;
import weapon.Sword;
import weapon.Weapon;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;

public class Hero extends Character {
    private int mana;

    public Hero() {
        super();
    }

    public Hero(String name, int health, int mana, boolean dodge, boolean parry) {
        super(name, health, dodge, parry);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public static Hero getHero() {
        Armor helmet = new Helmet(5, 3);
        Armor breastplate = new Breastplate(8,5);
        Armor boots = new Boots(5,3);
        Armor gloves = new Gloves(5,3);
        Armor legs = new Legs(7,4);
        Weapon sword = new Sword(12);
        Hero hero = new Hero(null, 80, 50, false, false);
        hero.setName(hero.getHeroName());
        hero.setHands(new ArrayList<>());
        hero.setBody(new ArrayList<>());
        hero.getHands().add(sword);
        hero.getBody().add(helmet);
        hero.getBody().add(breastplate);
        hero.getBody().add(gloves);
        hero.getBody().add(legs);
        hero.getBody().add(boots);
        return hero;
    }

    public String getHeroName() {
        System.out.println("Введите имя героя: ");
        Scanner scanner = new Scanner(System.in);
        String name = null;
        while (name == null) {
            try {
                name = scanner.nextLine();
            } catch (InputMismatchException ime) {
                System.out.println("Введите имя героя: ");
            }
        }
        return name;
    }
}
