package week7.interfaces.exercises;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HourlyEmployee hourlyEmployee = new HourlyEmployee(40, 20);
        Freelancer freelancer = new Freelancer(100);
        Invoice invoice = new Invoice(10, 25);

        List<Payable> payables = new ArrayList<>();
        payables.add(hourlyEmployee);
        payables.add(freelancer);
        payables.add(invoice);

        for(Payable p : payables) {
            System.out.println(p.getPaymentAmount());
        }

        System.out.println("***** transformer *****");
        Transformer t1 = new Transformer("optimus prime");
        Transformer t2 = new Transformer("bumble bee");

        List<Transformable> transformables = new ArrayList<>();
        transformables.add(t1);
        transformables.add(t2);

        for(Transformable t: transformables) {
            t.transform();
        }

        for(Transformable t: transformables) {

            if(t instanceof Transformer transformer) {
                System.out.println("Is transformed: " + transformer.isTransformed());
            }
            // same functionality but with explicit cast (old syntax)
//            if(t instanceof Transformer) {
//                Transformer transformer = (Transformer) t;
//                System.out.println(transformer.isTransformed());
//            }
        }
    }
}
