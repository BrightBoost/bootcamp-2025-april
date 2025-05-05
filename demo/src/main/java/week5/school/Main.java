package week5.school;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Java 101");
        Course course2 = new Course("Python 101");

        Faculty faculty = new Faculty("Engineering");

        Student student = new Student("Josh", "123avc", "Computer science", faculty, true);

        student.getCourses().add(new Course("arts and crafts"));
        student.signUpForCourse(course1);
        student.signUpForCourse(new Course("Java 101"));
        student.signUpForCourse(course2);

        System.out.println(student);

    }
}
