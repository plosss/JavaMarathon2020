package day9;

public class Teacher extends Human {
    private String subject;

    public Teacher(String name, String subject){
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printInfo(){
        System.out.println("Этот человек с именем " + super.getName());
        System.out.println("Этот преподаватель с именем " + getName());
    }
}
