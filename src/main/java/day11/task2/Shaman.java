package day11.task2;

public class Shaman extends Hero implements PhysAttack, Healer, MagicAttack {

    public Shaman() {
        health = 100;
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
        magicAtt = 15;
    }
    @Override
    public void healHimself() {
        if (health + 50 > maxLife) {
            health = maxLife;
        } else health += 50;

    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + 30 > maxLife) {
            hero.health = maxLife;
        } else hero.health += 30;

    }


    public void magicalAttack(Hero hero) {
        double udar2 = magicAtt - (magicAtt * hero.magicDef);
        if (hero.health - udar2 < 0) {
            hero.health = minLife;
        } else hero.health -= udar2;

    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
