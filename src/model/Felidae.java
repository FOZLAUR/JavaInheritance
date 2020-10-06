package model;

public class Felidae extends Animal{
    public Felidae(){}

    public Felidae(int age, double weight){
        this.age = age;
        this.weight = weight;
    }

    public Felidae(int age, double weight, boolean running, boolean eating){
        this.age = age;
        this.weight = weight;
        this.running = running;
        this.eating = eating;
    }

    public void meowMeow(){
        System.out.println("I am meowing!");
    }
}
