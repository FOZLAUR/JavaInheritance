package model;

public class Felidae extends Animal{

    public Felidae(int age, double weight){
        super(age, weight);
    }

    public Felidae(int age, double weight, boolean running, boolean eating){
        super(age, weight, running, eating);
    }

    public void meowMeow(){
        System.out.println("I am meowing!");
    }
}
