package day6;

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

    void evaluate(Student student, int evaluation) {
        switch (evaluation){
            case 2:
                System.out.println("преподаватель " + name + " оценил студента с именем " + student.getName()
                + " по предмету "+ subject + " на оценку неудовлитеворительно");
                break;
            case 3:
                System.out.println("преподаватель " + name + " оценил студента с именем " + student.getName()
                        + " по предмету "+ subject + " на оценку удовлитеворительно");
                break;
            case 4:
                System.out.println("преподаватель " + name + " оценил студента с именем " + student.getName()
                        + " по предмету "+ subject + " на оценку хорошо");
                break;
            case 5:
                System.out.println("преподаватель " + name + " оценил студента с именем " + student.getName()
                        + " по предмету "+ subject + " на оценку отлично");
                break;
            default:
                System.out.println("Неправильная оценка");
        }

    }
}
