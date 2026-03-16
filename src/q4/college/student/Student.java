package q4.college.student;

public class Student {

    String name;

    public Student(String name){
        this.name = name;
    }

    public void display(){
        System.out.println("Student: " + name);
    }
}