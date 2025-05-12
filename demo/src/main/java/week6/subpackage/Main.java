package week6.subpackage;

import week6.Rabbit;

public class Main  {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.setName("Choco");
       // rabbit.hide(); not accessible

        LopRabbit lopRabbit = new LopRabbit();
        lopRabbit.setName("Loppie");
        lopRabbit.attendRabbitShow();
//        lopRabbit.hide(); // not accessible, because protected - so only inside the child class
    }
}
