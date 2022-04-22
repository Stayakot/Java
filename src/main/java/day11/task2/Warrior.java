package day11.task2;

import day11.task1.Warehouse;

public class Warrior extends Hero implements PhysAttack {


    public Warrior() {
        health = 100;
        physDef = 0.8;
        physAtt = 30;
        magicDef = 0;
        magicAtt = 0;
    }

    double minLife = 0;
    double maxLife = 0;

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
