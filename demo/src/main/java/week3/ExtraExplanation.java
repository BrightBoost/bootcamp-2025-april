package week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExtraExplanation {
    public static void main(String[] args) {
        writingFile();
        readFile();
    }

    public static void writingFile() {
        // using try with resources try() << that automatically closes the resource
        // resource == filewriter
        try(FileWriter fw = new FileWriter("data/text.txt")) {
            // writing is happening here
            String[] arr = {"some", "random", "words", "123"};
            for(int i = 0; i < arr.length; i++) {
                fw.write(arr[i] + "\n");
            }
            // dont need to close because of try with resource sytnax
        } catch(IOException e) {
            // exception handling will be here
            System.out.println("Oh dear: " + e.getMessage());
        }
    }

    public static void readFile() {
        // try with resources to create the reader
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("data/input.txt"))) {
            //  reading is happening
            // we want to read all the lines, so we loop
            String line;
            int count = 0;
            // when we reach the end of the file, readline will give us null
            while((line = bufferedReader.readLine()) != null) {
                if(line.contains("error")) {
                    System.out.println(line);
                } else {
                    System.out.println(count + ": This line has no error");
                }
                count++;
            }
            // dont need to close the reader because of the try with resources
        } catch(IOException e) {
            System.out.println("Oh no: " + e.getMessage());
        }
    }
}
