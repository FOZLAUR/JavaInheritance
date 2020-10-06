package model;

public class Animal {
    public int age;
    private double weight;
    public boolean running;
    public boolean eating;

    public Animal() {
        this.age = 0;
        this.weight = 1.0;
        this.running = false;
        this.eating = false;
    }

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
        this.running = false;
        this.eating = false;
    }

    public Animal(int age, double weight, boolean running, boolean eating) {
        this.age = age;
        this.weight = weight;
        this.running = running;
        this.eating = eating;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public boolean isEating() {
        return eating;
    }

    public void setEating(boolean eating) {
        this.eating = eating;
    }
}
