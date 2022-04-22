package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    public Magician() {
        health = 100;
        physDef = 0;
        physAtt = 5;
        magicAtt = 20;
        magicDef = 0.8;
    }


    @Override
    public void magicalAttack(Hero hero) {
        double udar2 = magicAtt - (magicAtt * hero.magicDef);
        if (hero.health - udar2 < 0) {
            hero.health = minLife;
        } else hero.health -= udar2;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
