package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Нина","История");
        Student student = new Student("Вася");
        teacher.evaluate(student,1);
    }
}
