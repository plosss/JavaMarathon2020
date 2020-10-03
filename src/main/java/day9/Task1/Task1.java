package day9.Task1;

import day9.Student;
import day9.Teacher;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Bil","PO");
        Teacher teacher = new Teacher("John", "history");

        student.printInfo();
        teacher.printInfo();

        System.out.println(student.getGroup());
        System.out.println(teacher.getSubject());
    }
}
