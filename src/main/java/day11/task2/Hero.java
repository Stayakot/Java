package day11.task2;

public abstract class Hero implements PhysAttack {
    double health;
    double physDef;
    double magicDef;
    double physAtt;
    double magicAtt;
    double minLife = 0;
    double maxLife = 100;


    public void physicalAttack(Hero hero) {
        double udar = physAtt - (physAtt * hero.physDef);
        if (hero.health - udar <= 0) {
            hero.health = minLife;
        } else hero.health -= udar;
    }

}

