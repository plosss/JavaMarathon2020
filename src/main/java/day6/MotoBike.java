package day6;
public class MotoBike {
    private int year;
    private String color;
    private String model;

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public MotoBike(int year, String color, String model){
        this.year = year;
        this.color = color;
        this.model = model;
    }

    void info(){
        System.out.println("Это мотоцикл");
    }

    int yearDifference(int currentYear){
        return  currentYear - this.year;
    }
}
