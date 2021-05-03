package homework;

public class Main {

    public static void main(String[] args) {
        Toyota camry = new Toyota("camry",2003,Color.SILVER,new Engine(2.4),"автомат");
        System.out.println(camry.getInfo());
        camry.makeVoice("vuuuuuuu");
        camry.speed(240);

        Lexus es = new Lexus("es350",2013,Color.BLACK,new Engine(3.5),"автомат",
                "comfort+");
        es.speed(100);
        System.out.println(es.getInfo());
        Lexus gs = new Lexus("gs300",2008,Color.WHITE,new Engine(3.5),"механика",
                "comfort++");
        gs.speed(120);
        System.out.println(gs.getInfo());



    }
}
