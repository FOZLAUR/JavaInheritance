package fozlaur;

import model.Tiger;

public class Main {

    public static void main(String[] args) {
        System.out.println("Tigger using new Tiger()");
        Tiger tigger = new Tiger();
        tigger.displayData();
        tigger.setAge(2);
        tigger.setEating(false);
        tigger.setRunning(true);
        tigger.setWeight(175.0);
        tigger.meowMeow();
        tigger.displayData();

        System.out.println("Tony using new Tiger(age,weight) and using setEating");
        Tiger tony = new Tiger(3,200.0);
        tony.displayData();
        tony.setEating(true);
        tony.meowMeow();
        tony.displayData();

        System.out.println("Hobbes using new Tiger(age,weight,running,eating) and using setRunning");
        Tiger hobbes = new Tiger(5,100.0,false,true);
        hobbes.displayData();
        hobbes.setRunning(true);
        hobbes.meowMeow();
        hobbes.displayData();
    }
}
