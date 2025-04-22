package week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BasicFileReading {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("data/input.txt"))) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch(IOException e) {
            System.out.println("Problem: " + e.getMessage());
        }
    }

}
