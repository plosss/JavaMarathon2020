package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int randomValue = random.nextInt(4) + 2;
        String value = "";
        switch (randomValue) {
            case 2:
                value = "неудовлетворительно";
                break;
            case 3:
                value = "удовлетворительно";
                break;
            case 4:
                value = "хорошо";
                break;
            case 5:
                value = "отлично";
                break;
        }
        System.out.println("преподаватель " + this.name + " оценил студента с именем " + student.getName()
                + " по предмету " + this.subject + " на оценку " + value);

    }
}
