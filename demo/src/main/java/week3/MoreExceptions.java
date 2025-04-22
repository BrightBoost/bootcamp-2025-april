package week3;

import java.sql.SQLException;

public class MoreExceptions {
    public static void main(String[] args) {
        if(Math.random() > 0.5) {
            throw new NullPointerException("oh nooooooo");
        }
        System.out.println("blabla");
    }
}
