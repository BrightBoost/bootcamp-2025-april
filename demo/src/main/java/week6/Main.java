package week6;

import week6.subpackage.LopRabbit;

public class Main {
    public static void main(String[] args) {
        Owl owl = new Owl();
        owl.setName("Hedwig");
        owl.fly();
        owl.eat();

        BeardedDragon beardedDragon = new BeardedDragon();
        beardedDragon.setName("Barry");
        beardedDragon.shedSkin();
        beardedDragon.eat();

        Rabbit rabbit = new Rabbit();
        rabbit.setName("Choco");
        rabbit.hide();

        LopRabbit lopRabbit = new LopRabbit();
        lopRabbit.setName("Loppie");
        lopRabbit.attendRabbitShow();
        lopRabbit.hide();

    }
}
