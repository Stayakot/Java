package Final_Project;

import java.util.Scanner;

import static Final_Project.CheckCoordinates.*;
import static Final_Project.BattleField.*;


public class BattleShip {
    // поле первого игрока
    private BattleField playerOwn1Field;
    private BattleField playerEnemy1Field;
    // поле второго игрока
    private BattleField playerOwn2Field;
    private BattleField playerEnemy2Field;

    // true, пока игра идет. false, когда игра заканчивается
    private boolean gameIsOn;

    // кто сейчас ходит (true - player1, false - player2)
    private boolean isPlayer1;

    // количество кораблей на плаву игрока 1
    private int player1ShipCount;
    // количество кораблей на плаву игрока 2
    private int player2ShipCount;

    // единственный конструктор
    // внутри проверяется, что оба поля заполнены
    // также, инициализируются значения всех полей
    public BattleShip(BattleField playerOwn1Field, BattleField playerOwn2Field) {
        if (!playerOwn1Field.isPlayerFieldArranged() || !playerOwn2Field.isPlayerFieldArranged()) {
            System.out.println("Создание игры остановлено. Корабли на обоих полях должны быть расставлены.");
            throw new IllegalArgumentException();
        }

        this.playerOwn1Field = playerOwn1Field;
        this.playerOwn2Field = playerOwn2Field;


        this.player1ShipCount = 10;
        this.player2ShipCount = 10;

        gameIsOn = true;

        // who makes the first move
        isPlayer1 = Math.random() >= 0.5;
    }

    // запускает цикл игры пока gameIsOn = true
    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (gameIsOn) {
            if (isPlayer1) {
                System.out.println(playerOwn1Field.getPlayerName() + ", ваш ход!");

                System.out.println("Поле врага");
                playerOwn1Field.printEnemyField();
            } else {
                System.out.println(playerOwn2Field.getPlayerName() + ", ваш ход!");

                System.out.println("Поле врага");
                playerOwn2Field.printEnemyField();
            }


            String userInput = scanner.nextLine();

            while (!makeMove(isPlayer1, userInput)) {
                System.out.println("Ваш ход невалиден. Повторите ход.");
                userInput = scanner.nextLine();
            }
        }
    }

    // возвращает true, если userInput - валидный ход. Возвращает false, если userInput - невалидный ход
    // первый аргумент true если это ход первого игрока, false - если это ход второго игрока
    private boolean makeMove(boolean isPlayer1, String userInput) {
        if (!arrangement(userInput))
            return false;

        int[] coordinate = parseCoordinate(userInput);

        if (isPlayer1) {
            hit(playerOwn2Field.getPlayerOwnField(), playerOwn1Field.getPlayerEnemyField(), coordinate);
        } else {
            hit(playerOwn1Field.getPlayerOwnField(), playerOwn2Field.getPlayerEnemyField(), coordinate);


        }


        if (player1ShipCount == 0) {
            System.out.println(playerOwn2Field.getPlayerName() + " победил! Игра заканчивается");
            gameIsOn = false;
        }

        if (player2ShipCount == 0) {
            System.out.println(playerOwn1Field.getPlayerName() + " победил! Игра заканчивается");
            gameIsOn = false;
        }

        return true;
    }



    // Производит удар по ячейке
    // Выводит сообщение либо "Мимо!", либо "Попадание", либо "Утопил".
    // В случае потопления декременитирует количество кораблей на плаву
    // Переводит право на ход другому игроку, если удар был "Мимо!"
    private void hit(int[][] playerField, int[][] playerEnemyField, int[] hitCoordinate) {

        if (playerField[hitCoordinate[0]][hitCoordinate[1]] == 1) {
            playerField[hitCoordinate[0]][hitCoordinate[1]] = -2;
            playerEnemyField[hitCoordinate[0]][hitCoordinate[1]] = -2;

            if (shipSank(playerField, hitCoordinate)) {
                System.out.println("Утопил!");

                if (isPlayer1)
                    player2ShipCount--;
                else
                    player1ShipCount--;
            } else {
                System.out.println("Попадание!");
            }

        } else if
        (playerField[hitCoordinate[0]][hitCoordinate[1]] == 0 || playerField[hitCoordinate[0]][hitCoordinate[1]] == -1) {
            playerEnemyField[hitCoordinate[0]][hitCoordinate[1]] = 0;
            System.out.println("Мимо!");
            isPlayer1 = !isPlayer1; // переход хода
        }


    }

    // true - если удар утопил корабль
    // false - если удар не утопил корабль
    private boolean shipSank(int[][] playerField, int[] hitCoordinate) {
        // идем вверх - вниз и вправо-влево пока не упремся в ореол.
        // проверяем, есть ли 1
        int x = hitCoordinate[0];
        int y = hitCoordinate[1];

        if (x - 1 >= 0) {
            while (playerField[x][y] != 0) {
                x -= 1;
                if (playerField[x][y] == 1) {
                    return false;
                }
                if (x == 0) {
                    break;
                }
            }
        }


        x = hitCoordinate[0];
        if (x + 1 <= 9) {
            while (playerField[x][y] != 0) {

                x += 1;
                if (playerField[x][y] == 1) {
                    return false;
                }
                if (x == 9) {
                    break;
                }
            }
        }


        x = hitCoordinate[0];


        if (y + 1 <= 9) {
            while (playerField[x][y] != 0) {
                y += 1;
                if (playerField[x][y] == 1) {
                    return false;
                }
                if (y == 9) {
                    break;
                }
            }
        }

        y = hitCoordinate[1];
        if (y - 1 >= 0) {
            while (playerField[x][y] != 0) {
                y -= 1;
                if (playerField[x][y] == 1) {
                    return false;
                }
                if (y == 0) {
                    break;
                }
            }
        }


        return true;
    }
}