package homework;

public class Car {
    private String model;
    private int year;
    private Color color;
    private Engine engine;

    public Car(String model, int year, Color color, Engine engine) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Color getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public String drive() {
        return "ехать";
    }

    public void speed(int number){

    }

    public void makeVoice(String voice){

    }

}
