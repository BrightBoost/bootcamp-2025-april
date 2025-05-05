package week5.school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private String name;
    private String studentNumber;
    private  String major;
    private List<Course> courses = new ArrayList<>();
    private Faculty faculty;
    private boolean active;

    public Student() {
    }

    public Student(String name, String studentNumber, String major, Faculty faculty, boolean active) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.major = major;
        this.faculty = faculty;
        this.active = active;
    }

    public boolean signUpForCourse(Course course) {
        if(!courses.contains(course)) {
            courses.add(course);
            System.out.println(name + " added " + course.getName() + " to the courses list.");
            return true;
        } else {
            System.out.println(name + " already added to " + course.getName() + ". No action taken.");
            return false;
        }
    }

    public void displayStudentInfo() {
        String s = "Student{" +
                    "name='" + name + '\'' +
                    ", studentNumber='" + studentNumber + '\'' +
                    ", major='" + major + '\'' +
                    ", courses=" + courses +
                    ", faculty=" + faculty.getName() +
                    ", active=" + active +
                    '}';
        System.out.println(s);
    }

    public void displayStudentInfo(List<String> thingsToDisplay) {
        String s = "";
        if(thingsToDisplay.contains("name")) {
            s +=  "name='" + name + '\'';
        }
        if(thingsToDisplay.contains("studentNumber")) {
            s += ", studentNumber='" + studentNumber + '\'';
        }
        // if etc

        System.out.println(s);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public List<Course> getCourses() {
        return new ArrayList<>(courses);
    }



    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", major='" + major + '\'' +
                ", courses=" + courses +
                ", faculty=" + faculty.getName() +
                ", active=" + active +
                '}';
    }
}
