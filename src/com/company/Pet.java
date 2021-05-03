package com.company;

import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private Color color;
    private Shelter shelter;

    public Pet(int age, Color color, Shelter shelter){
        this.age = age;
        this.color = color;
        this.shelter = shelter;
    }
    public  Pet(){

    }

    public Color getColor(){
        return color;
    }
    public void  setColor(Color color){
        this.color = color;
    }

    public Shelter getShelter(){
        return shelter;
    }

    public void setShelter(Shelter shelter){
        this.shelter = shelter;
    }

    private int generateDefaultAge(){
        return new Random().nextInt(14) + 1;
    }

    public final String getInfo(){
        return "age " + age + "\n"  + "color"  + color + "\n" + " shelter " + shelter;
    }

}

