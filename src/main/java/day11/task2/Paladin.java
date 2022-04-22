package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {


    public Paladin() {
        health = 100;
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
        magicAtt = 0;
    }
    @Override
    public void healHimself() {
        if (health + 25 > maxLife) {
            health = maxLife;
        } else health += 25;

    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + 10 > maxLife) {
            hero.health = maxLife;
        } else hero.health += 10;

    }


    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
