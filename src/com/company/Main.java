package com.company;

public class Main {

    public static void main(String[] args) {
        Shelter shelter = new Shelter("Shelter №1", "ахунбаева 100");

        Dog puppy = new Dog("puppy", "овчарка", new String[] {"лежать", "лаять"}, Color.BLACK,
                shelter);
        puppy.makeVoice("гав гав", 2);

        Dog laika = new Dog("laika", "хаски", shelter, Color.WHITE);
        laika.makeVoice(4,"yyy ");

        Dog bars = new Dog();
        bars.setName("bars");
        bars.setBreed("чихуа хуа");
        bars.setCommands(new String[]{"сидеть"});
        bars.setColor(Color.BROWN);
        bars.setShelter(shelter);
        bars.makeVoice(3, "угу");

    }
}
