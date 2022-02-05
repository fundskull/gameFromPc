package services;

import armor.Armor;
import inputs.ContantsInput;
import personages.Enemy;
import personages.Hero;

public class FightService {
    public static void fight() {
        Hero hero = Hero.getHero();
        int dodgeChance = Armor.dodgeChanceWork(hero);
        int defence = Armor.defenceSum(hero);
        Enemy enemy = Enemy.getEnemy();
        int enemyAttack;
        int enemyBlock;
        int attack;
        int block;

        while (hero.getHealth() > 0 && enemy.getHealth() > 0) {
            enemyAttack = ContantsInput.ENEMY_ATTACK;
            enemyBlock = ContantsInput.ENEMY_BLOCK;
            if (dodgeChance >= ContantsInput.DODGE_CHANCE) {
                hero.setDodge(true);
            }
            attack = ContantsInput.numberAttackInput();
            block = ContantsInput.numberBlockInput();
            if (attack == enemyBlock) {
                System.out.println(hero.getName() + " промахнулся по противнику!");
            } else {
                enemy.setHealth((enemy.getHealth()) - hero.getHands().get(0).getDamage());
                System.out.println(hero.getName() + " успешно провёл атаку по " + enemy.getName() + ". У " + enemy.getName() + " осталось " + enemy.getHealth() + "хп.");
            }

            if (block == enemyAttack) {
                System.out.println(hero.getName() + " заблокировал удар противника");
            } else if (hero.isDodge()) {
                System.out.println(hero.getName() + " увернулся от удара противника");
            } else {
                hero.setHealth((hero.getHealth() + defence) - enemy.getAttack());
                System.out.println(enemy.getName() + " совершил сокрушительный удар по голове " + hero.getName() + ". У " + hero.getName() + " осталось " + hero.getHealth() + "хп.");
            }
        }
    }
}
