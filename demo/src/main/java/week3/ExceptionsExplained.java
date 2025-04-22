package week3;

import java.io.FileNotFoundException;

public class ExceptionsExplained {
    public static void main(String[] args) {
        // two types of exceptions: runtime exceptions (unchecked) and predictable exceptions (checked)

        // example of unchecked exception
        // fix it by writing better code (the if for null)
        String name = null;
        if(name != null) {
            System.out.println(name.substring(0));
        }

        // example of checked exception
        // reading a file - someone can move the file, file is opened and cant be accessed etc
        // trying to connect to a db that's turned off
        // fix it by specifying a protocol >> try catch statement
        try {
            // code that might throw an exception goes in the try block
            if(Math.random() > 0.5) {
                throw new FileNotFoundException("Fake exception");
            }
            System.out.println("no exception");
        } catch(FileNotFoundException e) {
            // protocol for if exception gets thrown
            System.out.println(e.getMessage());
        }
        System.out.println("All done");
    }
}
