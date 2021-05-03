package homework;

public class Toyota extends Car{
    private String transmission;

    public Toyota(String model, int year, Color color, Engine engine, String transmission) {
        super(model, year, color, engine);
        this.transmission = transmission;
    }

    public String getTransmission() {
        return transmission;
    }

    @Override
    public String drive() {
        return "гхгх";
    }

    @Override
    public void speed(int number) {
        System.out.println("максимальная скорость равна" + number );
    }

    @Override
    public final void makeVoice(String voice) {
        System.out.println(voice);
    }

    public String getInfo(){
        return getModel() + " " + getYear() + " " + getColor() + " " + getEngine().getSize() + " " + getTransmission()
                + " ";
    }
}
