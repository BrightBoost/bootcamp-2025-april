package week3;

import java.io.FileWriter;
import java.io.IOException;

public class BasicFileWriting {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("data/example.txt");
            writer.write("lsakdjas;lkjfas;dljfasd;\n");
            writer.write("lalala");

        } catch (IOException e) {
            System.out.println("Some IO issues: " + e.getMessage());
        } finally {
            // iehw nested try catch in finally block
            if(writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        // alternative for automatic close resources
        try(FileWriter fw = new FileWriter("data/example2.txt")) {
            fw.write("some text\n");
            fw.write("some more text\n");
            // end of the try block, invisible close() also when an exception is thrown
        } catch(IOException e) {
            System.out.println("Oh no: " + e.getMessage());
        } // no need for finally block now



    }
}
