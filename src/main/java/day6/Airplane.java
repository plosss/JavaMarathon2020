package day6;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public int getFuel() {
        return fuel;
    }
    public void setYear(int y){
        this.year = y;
    }
    public void setLength(int l){
        this.length = l;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: "
        + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    int fillUp(int l){
        return fuel = l;
    }
}

