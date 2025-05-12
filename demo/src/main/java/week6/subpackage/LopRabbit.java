package week6.subpackage;

import week6.Rabbit;

public class LopRabbit extends Rabbit {
    public void attendRabbitShow() {
        System.out.println(getName() + " is looking super cute.");
        System.out.println("oh no it hides now: ");
        hide();
    }
}
