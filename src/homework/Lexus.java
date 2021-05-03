package homework;

public final class Lexus extends Toyota{
    private String comfort;

    public Lexus(String model, int year, Color color, Engine engine, String transmission, String comfort) {
        super(model, year, color, engine, transmission);
        this.comfort = comfort;
    }

    public String getComfort() {
        return comfort;
    }

    @Override
    public void speed(int number) {
        int coef = 2;
        System.out.println("максимальная скорость равна" + (number*coef));
    }

    @Override
    public String getInfo() {
        return super.getInfo() + getComfort();
    }
}
