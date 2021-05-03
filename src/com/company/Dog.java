package com.company;

public class Dog extends Pet{
    private String name;
    private String breed;
    private String[] commands;


    public Dog() {
    }

    public Dog( String name, String breed, String[] commands, Color color, Shelter shelter ){

        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setColor(color);
        super.setShelter(shelter);

    }

    public Dog( String name, String breed, Shelter shelter ,Color color ){

        this.name = name;
        this.breed = breed;
        super.setColor(color);
        super.setShelter(shelter);

    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public String[] getCommands(){
        return commands;
    }
    public void setCommands(String[] commands){
        this.commands = commands;
    }

    void makeVoice(String voice, int number){
        for (int i = 0; i < number; i++) {
            System.out.println(voice );
        }

    }

    void makeVoice(int number, String voice   ){
        for (int i = 0; i < number; i++) {
            System.out.println(voice );
        }

    }

    public String getInfo(){
        return super.getInfo() + " name " + name + "\n" + " breed " + breed + "\n"  + " commands " + commands;

    }
}
