package q10.college.main;

import q10.college.student.*;
import q10.college.faculty.*;
import q10.college.department.*;

public class MainApp {

    public static void main(String[] args) {

        Student s = new Student("Amrit");
        Faculty f = new Faculty("Tanmay Sir");
        Department d = new Department("Computer Science");

        s.display();
        f.display();
        d.display();

    }
}