package model;

public class Tiger extends Felidae{
    public Tiger(){}

    public Tiger(int age, double weight){
        this.age = age;
        this.weight = weight;
    }

    public Tiger(int age, double weight, boolean running, boolean eating){
        this.age = age;
        this.weight = weight;
        this.running = running;
        this.eating = eating;
    }
}
