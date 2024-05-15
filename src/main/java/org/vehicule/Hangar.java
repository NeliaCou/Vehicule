package org.vehicule;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Hangar {
    public static void main(String[] args) {

        Car ferrari = new Car("Ferrari");
        Boat zodiac = new Boat("Zodiac");

        System.out.println(ferrari.doStuff());
        System.out.println(zodiac.doStuff());
    }
}