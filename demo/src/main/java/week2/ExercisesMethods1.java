package week2;

public class ExercisesMethods1 {

    public static void main(String[] args) {
        String name1 = "Lex";
        String name2 = "Sarah";
        printWelcome();
        displayPlayerName(name1);
        displayPlayerName(name2);
        showLevel(100);
        attack(name2 +"'s cat", name1+"'s spider");
        foundItem(name2, "potion");
        foundItem(name1, "elixer");
    }

    public static void printWelcome(){
        System.out.println("Welcome to code quest");
    }

    public static void displayPlayerName(String playerName) {
        System.out.println("Player joined: " + playerName);
    }

    public static void showLevel(int level) {
        System.out.println("Level: " + level);
    }

    public static void attack(String attacker, String target) {
        System.out.println(attacker + " attacks " + target);
    }

    public static void foundItem(String player, String item) {
        System.out.println(player + " found a " + item);
    }

}
