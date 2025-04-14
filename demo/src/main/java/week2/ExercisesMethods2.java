package week2;

import java.util.Scanner;

public class ExercisesMethods2 {
    public static void main(String[] args) {
        String gameName = getPlayerTitle("Ridwan");
        System.out.println(gameName);
        int value = 50;
        System.out.println("Original: " + value);
        int newValue = doubleXP(value);
        System.out.println("Double: " + newValue);

        boolean b1 = canOpenChest(true, true);
        boolean b2 = canOpenChest(false, false);
        boolean b3 = canOpenChest(true, false);
        boolean b4 = canOpenChest(false, true);

        System.out.println(b1 + " | " + b2 + " | " + b3 + " | " + b4);

        addGold(100);

        boolean defeatedBoss = isBossDefeated(150, 99, false);
        System.out.println(defeatedBoss);
    }

    public static String getPlayerTitle(String name) {
        return "King " + name;
    }

    public static int doubleXP(int xp) {
        int doubleXP = xp * 2;
        System.out.println("Normal XP earned: " + xp + "!");
        System.out.println("Double XP earned! You've earned: " + doubleXP);
        return doubleXP;
    }

    public static boolean canOpenChest(boolean hasKey, boolean lockIsBroken) {
        if(hasKey || lockIsBroken) {
            return true;
        }
        return false;
    }

    public static double addGold(int currentGold) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much gold did you find? ");
        double goldFound = scanner.nextDouble();

        if(goldFound > 100) {
            goldFound -= 0.1 * goldFound;
        }
        double total = currentGold + goldFound;
        System.out.println("New total gold: " + total);
        return total;
    }

    public static boolean isBossDefeated(int playerHP, int bossHP, boolean usedPotion) {
        if(bossHP <= 0) {
            return true;
        } else if(playerHP <= 0 && !usedPotion) {
            return false;
        } else if(usedPotion) {
            return playerHP + 50 > bossHP;
        }
        return playerHP > bossHP;
    }
}
