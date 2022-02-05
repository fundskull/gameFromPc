package inputs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContantsInput {
    public static final int DODGE_CHANCE = (int) (Math.random() * 100 + 1);
    public static final int ENEMY_ATTACK = (int) (Math.random() * 5 + 1);
    public static final int ENEMY_BLOCK = (int) (Math.random() * 5 + 1);

    public static int numberAttackInput() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число от 1 до 5 для атаки: ");
            try {
                int a = scanner.nextInt();
                if (a < 1 || a > 5) {
                    System.out.println("Вы ввели неподходящее число.");
                } else {
                    return a;
                }
            } catch (InputMismatchException ime) {
                System.out.print("");
            }
        }
    }

    public static int numberBlockInput() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число от 1 до 5 для защиты: ");
            try {
                int a = scanner.nextInt();
                if (a < 1 || a > 5) {
                    System.out.println("Вы ввели неподходящее число.");
                } else {
                    return a;
                }
            } catch (InputMismatchException ime) {
                System.out.print("");
            }
        }
    }
}