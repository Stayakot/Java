package day11.task2;

public class Task2 {
    public static void main(String[] args) {

        Warrior war = new Warrior();
        Magician mag = new Magician();
        Paladin pal = new Paladin();
        Shaman sham = new Shaman();

        war.physicalAttack(pal);
        System.out.println(pal);
        pal.physicalAttack(mag);
        System.out.println(mag);
        sham.healTeammate(mag);
        System.out.println(mag);
        mag.magicalAttack(pal);
        System.out.println(pal);
        sham.physicalAttack(war);
        System.out.println(war);
        pal.healHimself();
        System.out.println(pal);
        war.physicalAttack(mag);
        System.out.println(mag);
        war.physicalAttack(mag);
        System.out.println(mag);
        war.physicalAttack(mag);
        System.out.println(mag);
        war.physicalAttack(mag);
        System.out.println(mag);
        war.physicalAttack(mag);
        System.out.println(mag);

    }
}
