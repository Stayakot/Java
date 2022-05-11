package Final_Project;

public class Test {
    public static void main(String[] args) {

        BattleField battleField1 = new BattleField("Player 1");

        battleField1.filledField();


        BattleField battleField2 = new BattleField("Player2");
        battleField2.filledField();


        BattleShip battleship = new BattleShip(battleField1, battleField2);
        battleship.play();
    }
}
